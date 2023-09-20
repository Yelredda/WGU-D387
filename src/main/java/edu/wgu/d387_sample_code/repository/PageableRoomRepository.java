package edu.wgu.d387_sample_code.repository;

import edu.wgu.d387_sample_code.entity.RoomEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.time.LocalDate;

/*
public interface PageableRoomRepository extends PagingAndSortingRepository<RoomEntity, Long> {
	
	Page<RoomEntity> findById(Long id, Pageable page);
	Page<RoomEntity> findAvailableRooms(LocalDate checkin, LocalDate checkout, Pageable page);

}
*/