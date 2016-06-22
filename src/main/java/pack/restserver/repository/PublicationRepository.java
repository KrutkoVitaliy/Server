package pack.restserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pack.restserver.entity.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Long> {
}
