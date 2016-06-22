package pack.restserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pack.restserver.entity.Comment;

public interface CommentRepository  extends JpaRepository<Comment, Long> {
}
