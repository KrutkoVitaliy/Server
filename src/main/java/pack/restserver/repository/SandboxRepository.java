package pack.restserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pack.restserver.entity.Sandbox;

public interface SandboxRepository extends JpaRepository<Sandbox, Long> {
}
