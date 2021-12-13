package com.schedule.calendar.mapper;

import com.schedule.calendar.dto.EventDto;
import com.schedule.calendar.entity.Event;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface EventMapper {
    EventDto eventToDto(Event company);
    List<EventDto> eventsToDto (List<Event> companies);
    Event dtoToEvent(EventDto eventDto);
}
