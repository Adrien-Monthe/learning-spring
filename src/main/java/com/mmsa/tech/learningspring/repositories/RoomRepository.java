package com.mmsa.tech.learningspring.repositories;


import com.mmsa.tech.learningspring.data.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

}
