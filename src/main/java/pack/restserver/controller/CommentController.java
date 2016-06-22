package pack.restserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pack.restserver.entity.Comment;
import pack.restserver.service.CommentService;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/comments", method = RequestMethod.GET)
    @ResponseBody
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @RequestMapping(value = "/comments/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Comment addComment(@PathVariable("id") long id) {
        return commentService.getCommentByID(id);
    }

    @RequestMapping(value = "/comments", method = RequestMethod.POST)
    @ResponseBody
    public Comment addCommentEvent(@RequestBody Comment comment) {
        return commentService.addComment(comment);
    }

    @RequestMapping(value = "/comments/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteCommentEvent(@PathVariable("id") long id) {
        commentService.deleteComment(id);
    }
}
