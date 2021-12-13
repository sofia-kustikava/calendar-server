package com.schedule.calendar.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {
    private String name;
    private String description;
    private LocalDate dates;
}
