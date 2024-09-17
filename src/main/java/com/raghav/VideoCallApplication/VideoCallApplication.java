package com.raghav.VideoCallApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.raghav.VideoCallApplication.user.User;
import com.raghav.VideoCallApplication.user.UserService;

@SpringBootApplication
public class VideoCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoCallApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(UserService service) {
		return args -> {
			// Register users at startup
			service.register(User.builder()
					.username("Raghav")
					.email("raghav@gmail.com")
					.password("123")
					.build());
	
			service.register(User.builder()
					.username("Test")
					.email("test@gmail.com")
					.password("123")
					.build());
	
			service.register(User.builder()
					.username("Test2")
					.email("test2@gmail.com")
					.password("123")
					.build());
	
			// Log successful user registration
			System.out.println("Users registered successfully.");
		};
	}
}

