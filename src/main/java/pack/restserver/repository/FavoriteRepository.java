package pack.restserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pack.restserver.entity.Favorite;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
}
