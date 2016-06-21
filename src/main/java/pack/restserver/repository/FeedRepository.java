package pack.restserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pack.restserver.entity.Feed;

public interface FeedRepository extends JpaRepository<Feed, Long> {
}
