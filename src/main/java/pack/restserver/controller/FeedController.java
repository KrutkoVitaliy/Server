package pack.restserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pack.restserver.*;
import pack.restserver.entity.Feed;
import pack.restserver.entity.Profile;
import pack.restserver.service.FeedService;

import java.util.Date;
import java.util.List;

@RestController
public class FeedController {

    @Autowired
    private FeedService feedService;

    @RequestMapping(value = "/feed", method = RequestMethod.GET)
    @ResponseBody
    public List<Feed> getAllFeeds() {
        /*for(int i = 1; i<1621; i++) {
            Feed temp = new Feed();
            temp.setId(i);
            temp.setAuthor("Make me beauty");
            temp.setAvailableDate(new Date());
            temp.setColors(tempdata.colors[i-1]);
            temp.setTitle(titlestemp.titles[i-1]);
            temp.setOccasion(occasionstemp.occasions[i-1]);
            temp.setTags(tagstemp.tags[i-1]);
            temp.setDifficult(difficulttemp.difficult[i-1]);
            temp.setEye_color(eye_colortemp.eye_color[i-1]);
            addFeed(temp);
        }*/
        return feedService.getAllFeeds();
    }

    @RequestMapping(value = "/feed/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Feed getFeed(@PathVariable("id") long id) {
        return feedService.getFeedByID(id);
    }

    @RequestMapping(value = "/feed", method = RequestMethod.POST)
    @ResponseBody
    public Feed addFeed(@RequestBody Feed feed) {
        return feedService.addFeed(feed);
    }

    @RequestMapping(value = "/feed/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteFeed(@PathVariable long id) {
        feedService.deleteFeed(id);
    }
}