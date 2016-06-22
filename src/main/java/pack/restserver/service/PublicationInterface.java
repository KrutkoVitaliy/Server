package pack.restserver.service;

import pack.restserver.entity.Publication;

import java.util.List;

public interface PublicationInterface {
    List<Publication> getAllPublications();
    Publication getPublicationByID(long id);
    Publication addPublication(Publication publication);
    void deletePublication(long id);
}
