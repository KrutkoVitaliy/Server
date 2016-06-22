package pack.restserver.service;

import pack.restserver.entity.Favorite;

import java.util.List;

public interface FavoriteInterface {
    List<Favorite> getAllFavorites();
    Favorite getFavoriteByID(long id);
    Favorite addFavorite(Favorite favorite);
    void deleteFavorite(long id);
}
