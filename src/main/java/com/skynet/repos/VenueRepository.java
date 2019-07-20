package com.skynet.repos;

import org.springframework.data.repository.CrudRepository;

import com.skynet.entities.Venue;

public interface VenueRepository extends CrudRepository<Venue, Long> {

}
