package pack.restserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.restserver.entity.CalendarEvent;
import pack.restserver.repository.CalendarEventRepository;

import java.util.List;

@Service
public class CalendarEventService implements CalendarEventInterface{

    @Autowired
    private CalendarEventRepository calendarEventRepository;

    public List<CalendarEvent> getAllCalendarEvents() {
        return calendarEventRepository.findAll();
    }

    public CalendarEvent getCalendarEventByID(long id) {
        return calendarEventRepository.findOne(id);
    }

    public CalendarEvent addCalendarEvent(CalendarEvent calendarEvent) {
        return calendarEventRepository.saveAndFlush(calendarEvent);
    }

    public void deleteCalendarEvent(long id) {
        calendarEventRepository.delete(id);
    }
}
