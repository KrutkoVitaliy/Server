package pack.restserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pack.restserver.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
