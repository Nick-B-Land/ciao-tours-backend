package com.sait.ciaoToursEMS.repositorys;

import com.sait.ciaoToursEMS.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}