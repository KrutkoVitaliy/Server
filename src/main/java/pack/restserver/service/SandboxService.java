package pack.restserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.restserver.entity.Sandbox;
import pack.restserver.repository.SandboxRepository;

import java.util.List;

@Service
public class SandboxService implements SandboxInterface{

    @Autowired
    private SandboxRepository sandboxRepository;

    public List<Sandbox> getAllSandbox() {
        return sandboxRepository.findAll();
    }

    public Sandbox getSandboxByID(long id) {
        return sandboxRepository.findOne(id);
    }

    public Sandbox addSandbox(Sandbox sandbox) {
        return sandboxRepository.saveAndFlush(sandbox);
    }

    public void deleteSandbox(long id) {
        sandboxRepository.delete(id);
    }
}
