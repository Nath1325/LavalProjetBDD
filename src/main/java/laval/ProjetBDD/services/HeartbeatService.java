package laval.ProjetBDD.services;

import laval.ProjetBDD.interfaces.IHeartbeatService;
import laval.ProjetBDD.models.Heartbeat;
import org.springframework.stereotype.Service;

public class HeartbeatService implements IHeartbeatService {
    @Override
    public String sendHeartBeat() {
        Heartbeat h = new Heartbeat();
        h.setVille("Québec");
        return h.toString();
    }
}
