package pack.restserver.service;

import pack.restserver.entity.Sandbox;

import java.util.List;

public interface SandboxInterface {
    List<Sandbox> getAllSandbox();
    Sandbox getSandboxByID(long id);
    Sandbox addSandbox(Sandbox sandbox);
    void deleteSandbox(long id);
}
