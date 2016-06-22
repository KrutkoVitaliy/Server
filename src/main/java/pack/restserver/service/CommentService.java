package pack.restserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.restserver.entity.Comment;
import pack.restserver.repository.CommentRepository;

import java.util.List;

@Service
public class CommentService implements CommentInterface{

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Comment getCommentByID(long id) {
        return commentRepository.findOne(id);
    }

    public Comment addComment(Comment comment) {
        return commentRepository.saveAndFlush(comment);
    }

    public void deleteComment(long id) {
        commentRepository.delete(id);
    }
}
