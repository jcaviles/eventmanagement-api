package com.skynet.repos;

import org.springframework.data.repository.CrudRepository;

import com.skynet.entities.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}
