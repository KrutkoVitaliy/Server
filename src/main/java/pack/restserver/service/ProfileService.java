package pack.restserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.restserver.entity.Profile;
import pack.restserver.repository.ProfileRepository;

import java.util.List;

@Service
public class ProfileService implements ProfileServiceInterface {

    @Autowired
    ProfileRepository profileRepository;

    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    public Profile getProfileByID(long id) {
        return profileRepository.findOne(id);
    }

    public Profile addProfile(Profile profile) {
        return profileRepository.saveAndFlush(profile);
    }

    public void deleteProfile(long id) {
        profileRepository.delete(id);
    }
}
