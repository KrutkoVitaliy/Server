package pack.restserver.service;

import pack.restserver.entity.CalendarEvent;

import java.util.List;

public interface CalendarEventInterface {
    List<CalendarEvent> getAllCalendarEvents();
    CalendarEvent getCalendarEventByID(long id);
    CalendarEvent addCalendarEvent(CalendarEvent calendarEvent);
    void deleteCalendarEvent(long id);
}
