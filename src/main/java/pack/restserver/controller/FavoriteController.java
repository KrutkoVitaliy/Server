package pack.restserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pack.restserver.entity.Favorite;
import pack.restserver.service.FavoriteService;

import java.util.List;

@RestController
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    @RequestMapping(value = "/favorites", method = RequestMethod.GET)
    @ResponseBody
    public List<Favorite> getAllFavorites() {
        return favoriteService.getAllFavorites();
    }

    @RequestMapping(value = "/favorites/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Favorite getFavorite(@PathVariable("id") long id) {
        return favoriteService.getFavoriteByID(id);
    }

    @RequestMapping(value = "/favorites", method = RequestMethod.POST)
    @ResponseBody
    public Favorite addFavorite(@RequestBody Favorite favorite) {
        return favoriteService.addFavorite(favorite);
    }

    @RequestMapping(value = "/favorites/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteFavorite(@PathVariable("id") long id) {
        favoriteService.deleteFavorite(id);
    }
}
