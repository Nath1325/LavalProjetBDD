package laval.ProjetBDD;

import laval.ProjetBDD.interfaces.IHeartbeatService;
import laval.ProjetBDD.services.HeartbeatService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjetBddApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetBddApplication.class, args);
	}

	@Bean
	public IHeartbeatService heartbeatService(){
		return new HeartbeatService();
	}

}
