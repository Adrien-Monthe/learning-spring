package com.mmsa.tech.learningspring.util;

import com.mmsa.tech.learningspring.data.Room;
import com.mmsa.tech.learningspring.repositories.RoomRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class AppStartUpEvent implements ApplicationListener<ApplicationReadyEvent> {
    private final RoomRepository roomRepository;

    public AppStartUpEvent(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {

        Iterable<Room> rooms = this.roomRepository.findAll();

        rooms.forEach(System.out::println);
    }
}
