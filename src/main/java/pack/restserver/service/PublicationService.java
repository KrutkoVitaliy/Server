package pack.restserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.restserver.entity.Publication;
import pack.restserver.repository.PublicationRepository;

import java.util.List;

@Service
public class PublicationService implements PublicationInterface{

    @Autowired
    private PublicationRepository publicationRepository;

    public List<Publication> getAllPublications() {
        return publicationRepository.findAll();
    }

    public Publication getPublicationByID(long id) {
        return publicationRepository.findOne(id);
    }

    public Publication addPublication(Publication publication) {
        return publicationRepository.saveAndFlush(publication);
    }

    public void deletePublication(long id) {
        publicationRepository.delete(id);
    }
}
