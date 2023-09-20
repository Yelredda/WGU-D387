package edu.wgu.d387_sample_code.convertor;

import edu.wgu.d387_sample_code.entity.RoomEntity;
import edu.wgu.d387_sample_code.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Project: D387 sample code
 * Package: edu.wgu.d387_sample_code.convertor
 * <p>
 * User: carolyn.sher
 * Date: 9/16/2022
 * Time: 4:54 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Service
public class RoomServiceImpl implements RoomService{
    private RoomRepository roomRepository;

    @Autowired
    public  RoomServiceImpl(RoomRepository roomRepository){
        this.roomRepository=roomRepository;
    }


    @Override
    public RoomEntity findById(long theId) {

    Optional<RoomEntity> result = roomRepository.findById(theId);

    RoomEntity theRoom = null;

    if (result.isPresent()) {
        theRoom = result.get();
    }
    else {
        // we didn't find the employee
        //throw new RuntimeException("Did not find part id - " + theId);
        return null;
    }

    return theRoom;

    }

    @Override
    public List<RoomEntity> findAll() {
        return (List<RoomEntity>)roomRepository.findAll();
    }


}
