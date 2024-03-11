package com.example.demo.Mapper;

import com.example.demo.Dto.EventDto;
import com.example.demo.Model.Event;

public class EventMapper {

    public static EventDto mapToEventDto(Event event) {
        return new EventDto(
            event.getId(),
            event.getName(),
            event.getOrganization(),
            event.getEmail(),
            event.getMobile(),
            event.getCity(),
            event.getVenue(),
            event.getFromDate(),
            event.getToDate(),
            event.getAttendees(),
            event.getThemeFile(),
            event.getEnquiry(),
            event.getOtherDetails()
        );
    }

    public static Event mapToEvent(EventDto eventDto) {
        return new Event(
            eventDto.getId(),
            eventDto.getName(),
            eventDto.getOrganization(),
            eventDto.getEmail(),
            eventDto.getMobile(),
            eventDto.getCity(),
            eventDto.getVenue(),
            eventDto.getFromDate(),
            eventDto.getToDate(),
            eventDto.getAttendees(),
            eventDto.getThemeFile(),
            eventDto.getEnquiry(),
            eventDto.getOtherDetails()
        );
    }
}
