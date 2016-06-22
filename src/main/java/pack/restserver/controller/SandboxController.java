package pack.restserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pack.restserver.entity.Sandbox;
import pack.restserver.service.SandboxService;

import java.util.List;

@RestController
public class SandboxController {

    @Autowired
    private SandboxService sandboxService;

    @RequestMapping(value = "/sandbox", method = RequestMethod.GET)
    @ResponseBody
    public List<Sandbox> getSandboxes() {
        return sandboxService.getAllSandbox();
    }

    @RequestMapping(value = "/sandbox/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Sandbox getSandbox(@PathVariable("id") long id) {
        return sandboxService.getSandboxByID(id);
    }

    @RequestMapping(value = "/sandbox", method = RequestMethod.POST)
    @ResponseBody
    public Sandbox addSandbox(@RequestBody Sandbox sandbox) {
        return sandboxService.addSandbox(sandbox);
    }

    @RequestMapping(value = "/sandbox/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteSandbox(@PathVariable("id") long id) {
        sandboxService.deleteSandbox(id);
    }
}
