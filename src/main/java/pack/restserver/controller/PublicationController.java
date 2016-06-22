package pack.restserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pack.restserver.entity.Publication;
import pack.restserver.service.PublicationService;

import java.util.List;

@RestController
public class PublicationController {

    @Autowired
    private PublicationService publicationService;

    @RequestMapping(value = "/publication", method = RequestMethod.GET)
    @ResponseBody
    public List<Publication> getAllPublications() {
        return publicationService.getAllPublications();
    }

    @RequestMapping(value = "/publication/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Publication getPublication(@PathVariable("id") long id) {
        return publicationService.getPublicationByID(id);
    }

    @RequestMapping(value = "/publication", method = RequestMethod.POST)
    @ResponseBody
    public Publication addPublication(@RequestBody Publication publication) {
        return publicationService.addPublication(publication);
    }

    @RequestMapping(value = "/publication/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deletePublication(@PathVariable("id") long id) {
        publicationService.deletePublication(id);
    }
}
