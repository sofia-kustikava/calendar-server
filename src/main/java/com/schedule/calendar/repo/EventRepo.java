package com.schedule.calendar.repo;

import com.schedule.calendar.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventRepo extends JpaRepository<Event, Long> {
    Optional<Event> findById(Long id);
}
