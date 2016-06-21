package pack.restserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.restserver.entity.Feed;
import pack.restserver.repository.FeedRepository;

import java.util.List;

@Service
public class FeedService implements FeedServiceInterface{

    @Autowired
    private FeedRepository feedRepository;

    public List<Feed> getAllFeeds() {
        return feedRepository.findAll();
    }

    public Feed getFeedByID(long id) {
        return feedRepository.findOne(id);
    }

    public Feed addFeed(Feed feed) {
        return feedRepository.saveAndFlush(feed);
    }

    public void deleteFeed(long id) {
        feedRepository.delete(id);
    }
}
