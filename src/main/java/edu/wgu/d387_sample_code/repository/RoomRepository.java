package edu.wgu.d387_sample_code.repository;

import java.util.List;

import edu.wgu.d387_sample_code.entity.RoomEntity;
import org.springframework.data.repository.CrudRepository;



public interface RoomRepository extends CrudRepository<RoomEntity, Long> {

	//RoomEntity findById(Long id);
}
