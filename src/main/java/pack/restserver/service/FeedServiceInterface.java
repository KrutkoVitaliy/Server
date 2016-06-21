package pack.restserver.service;

import pack.restserver.entity.Feed;

import java.util.List;

public interface FeedServiceInterface {
    List<Feed> getAllFeeds();
    Feed getFeedByID(long id);
    Feed addFeed(Feed feed);
    void deleteFeed(long id);
}
