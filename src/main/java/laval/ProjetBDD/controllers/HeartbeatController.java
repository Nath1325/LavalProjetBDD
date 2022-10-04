package laval.ProjetBDD.controllers;

import laval.ProjetBDD.interfaces.IHeartbeatService;
import laval.ProjetBDD.models.Heartbeat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("heartbeat")
public class HeartbeatController {

    private final IHeartbeatService heartbeatService;

    public HeartbeatController(IHeartbeatService heartbeatService) {
        this.heartbeatService = heartbeatService;
    }

    @GetMapping("/")
    public Heartbeat getHeartbeat(){
        Heartbeat h = new Heartbeat();
        h.setVille("Québec");
        return h;
    }
}
