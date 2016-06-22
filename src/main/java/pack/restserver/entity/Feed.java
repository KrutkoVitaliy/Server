package pack.restserver.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "feed")
public class Feed {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "sid")
    private String sid;

    @Column(name = "title")
    private String title;

    @Column(name = "available_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date availableDate;

    @Column(name = "likes")
    private String likes;

    @Column(name = "colors")
    private String colors;

    @Column(name = "eye_color")
    private String eye_color;

    @Column(name = "occasion")
    private String occasion;

    @Column(name = "difficult")
    private String difficult;

    @Column(name = "tags")
    private String tags;

    @Column(name = "screen1")
    private String screen1;

    @Column(name = "screen2")
    private String screen2;

    @Column(name = "screen3")
    private String screen3;

    @Column(name = "screen4")
    private String screen4;

    @Column(name = "screen5")
    private String screen5;

    @Column(name = "screen6")
    private String screen6;

    @Column(name = "screen7")
    private String screen7;

    @Column(name = "screen8")
    private String screen8;

    @Column(name = "screen9")
    private String screen9;

    @Column(name = "screen10")
    private String screen10;

    @Column(name = "publicate")
    private boolean publicate;

    public Feed() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(Date availableDate) {
        this.availableDate = availableDate;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public String getDifficult() {
        return difficult;
    }

    public void setDifficult(String difficult) {
        this.difficult = difficult;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getScreen1() {
        return screen1;
    }

    public void setScreen1(String screen1) {
        this.screen1 = screen1;
    }

    public String getScreen2() {
        return screen2;
    }

    public void setScreen2(String screen2) {
        this.screen2 = screen2;
    }

    public String getScreen3() {
        return screen3;
    }

    public void setScreen3(String screen3) {
        this.screen3 = screen3;
    }

    public String getScreen4() {
        return screen4;
    }

    public void setScreen4(String screen4) {
        this.screen4 = screen4;
    }

    public String getScreen5() {
        return screen5;
    }

    public void setScreen5(String screen5) {
        this.screen5 = screen5;
    }

    public String getScreen6() {
        return screen6;
    }

    public void setScreen6(String screen6) {
        this.screen6 = screen6;
    }

    public String getScreen7() {
        return screen7;
    }

    public void setScreen7(String screen7) {
        this.screen7 = screen7;
    }

    public String getScreen8() {
        return screen8;
    }

    public void setScreen8(String screen8) {
        this.screen8 = screen8;
    }

    public String getScreen9() {
        return screen9;
    }

    public void setScreen9(String screen9) {
        this.screen9 = screen9;
    }

    public String getScreen10() {
        return screen10;
    }

    public void setScreen10(String screen10) {
        this.screen10 = screen10;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public boolean isPublicate() {
        return publicate;
    }

    public void setPublicate(boolean publicate) {
        this.publicate = publicate;
    }
}
