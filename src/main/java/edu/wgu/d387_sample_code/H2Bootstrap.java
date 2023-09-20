package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.entity.RoomEntity;
import edu.wgu.d387_sample_code.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class H2Bootstrap implements CommandLineRunner {

	@Autowired
	RoomRepository roomRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Bootstrapping data: ");
		RoomEntity room1= new RoomEntity(405, "200");
		room1.setId(1L);
		
		roomRepository.save(room1);

		RoomEntity room2= new RoomEntity(406, "220");
		room2.setId(2L);

		roomRepository.save(room2);

		RoomEntity room3= new RoomEntity(407, "260");
		room3.setId(3L);

		roomRepository.save(room3);

		
		Iterable<RoomEntity> itr = roomRepository.findAll();
		
		System.out.println("Printing out data: ");
		for(RoomEntity room : itr) {
			System.out.println(room.getRoomNumber());
		}
	}

}
