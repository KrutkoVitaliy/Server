package pack.restserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pack.restserver.entity.CalendarEvent;
import pack.restserver.service.CalendarEventService;

import java.util.List;

@RestController
public class CalendarEventController {

    @Autowired
    private CalendarEventService calendarEventService;

    @RequestMapping(value = "/calendar", method = RequestMethod.GET)
    @ResponseBody
    public List<CalendarEvent> getAllCalendarEvents() {
        return calendarEventService.getAllCalendarEvents();
    }

    @RequestMapping(value = "/calendar/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CalendarEvent getCalendarEvent(@PathVariable("id") long id) {
        return calendarEventService.getCalendarEventByID(id);
    }

    @RequestMapping(value = "/calendar", method = RequestMethod.POST)
    @ResponseBody
    public CalendarEvent addCalendarEvent(@RequestBody CalendarEvent calendarEvent) {
        return calendarEventService.addCalendarEvent(calendarEvent);
    }

    @RequestMapping(value = "/calendar/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteCalendarEvent(@PathVariable("id") long id) {
        calendarEventService.deleteCalendarEvent(id);
    }
}
