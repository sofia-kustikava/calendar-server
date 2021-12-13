package com.schedule.calendar.controller;

import com.schedule.calendar.dto.EventDto;
import com.schedule.calendar.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

    @GetMapping("/show/{id}")
    public EventDto show(@PathVariable Long id) {
        return eventService.showEvent(id);
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody EventDto eventDto) {
        eventService.createEvent(eventDto);
        return new ResponseEntity<>("Вы создали важное событие", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        eventService.deleteEvent(id);
        return new ResponseEntity<>("Вы удалили важное событие", HttpStatus.OK);
    }

    @GetMapping("/show/all")
    public List<EventDto> showAll() {
        return eventService.showAllEvents();
    }
}
