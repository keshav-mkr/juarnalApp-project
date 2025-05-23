package net.engineeringdigest.juarnalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableScheduling
public class JuarnalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JuarnalApplication.class, args);

	}

}
