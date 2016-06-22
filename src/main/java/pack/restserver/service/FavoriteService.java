package pack.restserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.restserver.entity.Favorite;
import pack.restserver.repository.FavoriteRepository;

import java.util.List;

@Service
public class FavoriteService implements FavoriteInterface{

    @Autowired
    private FavoriteRepository favoriteRepository;

    public List<Favorite> getAllFavorites() {
        return favoriteRepository.findAll();
    }

    public Favorite getFavoriteByID(long id) {
        return favoriteRepository.findOne(id);
    }

    public Favorite addFavorite(Favorite favorite) {
        return favoriteRepository.saveAndFlush(favorite);
    }

    public void deleteFavorite(long id) {
        favoriteRepository.delete(id);
    }
}
