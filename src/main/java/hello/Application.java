package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.*;

@SpringBootApplication
@RestController
public class Application {

        private String hostname() {
		try {
			return InetAddress.getLocalHost().getHostName();
		} catch (java.net.UnknownHostException e) {
			return "UNKNOWN";
		}
        }

	@RequestMapping("/")
	public String home() {
		return "Hello World! Served by: " + hostname();
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
