package pack.restserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pack.restserver.entity.CalendarEvent;

public interface CalendarEventRepository extends JpaRepository<CalendarEvent, Long>{
}
