package pack.restserver.service;

import pack.restserver.entity.Comment;

import java.util.List;

public interface CommentInterface {
    List<Comment> getAllComments();
    Comment getCommentByID(long id);
    Comment addComment(Comment comment);
    void deleteComment(long id);
}
