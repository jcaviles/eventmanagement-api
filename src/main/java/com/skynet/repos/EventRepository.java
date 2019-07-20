package com.skynet.repos;

import org.springframework.data.repository.CrudRepository;

import com.skynet.entities.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}
