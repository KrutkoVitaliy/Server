package pack.restserver.service;

import pack.restserver.entity.Profile;

import java.util.List;

public interface ProfileServiceInterface {
    List<Profile> getAllProfiles();
    Profile getProfileByID(long id);
    Profile addProfile(Profile profile);
    void deleteProfile(long id);
}