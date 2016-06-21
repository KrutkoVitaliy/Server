package pack.restserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pack.restserver.entity.Profile;
import pack.restserver.service.ProfileService;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @RequestMapping(value = "/profiles", method = RequestMethod.GET)
    @ResponseBody
    public List<Profile> getAllProfile() {
        return profileService.getAllProfiles();
    }

    @RequestMapping(value = "/profile/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Profile getProfile(@PathVariable("id") long id) {
        return profileService.getProfileByID(id);
    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    @ResponseBody
    public Profile addProfile(@RequestBody Profile profile) {
        return profileService.addProfile(profile);
    }

    @RequestMapping(value = "/profile/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteProfile(@PathVariable long id) {
        profileService.deleteProfile(id);
    }
}
