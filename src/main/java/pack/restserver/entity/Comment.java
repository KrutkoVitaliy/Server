package pack.restserver.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "pid")
    private long pid;

    @Column(name = "author")
    private String author;

    @Column(name = "comment")
    private String comment;

    @Column(name = "available_date")
    private Date available_date;

    @Column(name = "author_photo")
    private String author_photo;

    public Comment() {

    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getAvailable_date() {
        return available_date;
    }

    public void setAvailable_date(Date available_date) {
        this.available_date = available_date;
    }

    public String getAuthor_photo() {
        return author_photo;
    }

    public void setAuthor_photo(String author_photo) {
        this.author_photo = author_photo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
