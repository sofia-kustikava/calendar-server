package com.schedule.calendar.service;

import com.schedule.calendar.dto.EventDto;
import com.schedule.calendar.entity.Event;
import com.schedule.calendar.mapper.EventMapper;
import com.schedule.calendar.repo.EventRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepo eventRepo;
    private final EventMapper eventMapper;

    public void createEvent(EventDto eventDto) {
        Event createdEvent = Event.builder()
                .name(eventDto.getName())
                .description(eventDto.getDescription())
                .dates(eventDto.getDates())
                .build();
        eventRepo.save(createdEvent);
    }

    public EventDto showEvent(Long id) {
        Event event = eventRepo.findById(id).orElseThrow(() -> new RuntimeException("Id not exist"));
        return eventMapper.eventToDto(event);
    }

    public void deleteEvent(Long id) {
        Event event = eventRepo.findById(id).orElseThrow(() -> new RuntimeException("Id not exist"));
        eventRepo.delete(event);
    }

    public List<EventDto> showAllEvents() {
        List<Event> events = eventRepo.findAll();
        return eventMapper.eventsToDto(events);
    }
}
