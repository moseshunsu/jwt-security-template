package com.higherAchievers;

import com.higherAchievers.dto.UserRequest;
import com.higherAchievers.service.AuthService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.higherAchievers.user.Role.ADMIN;
import static com.higherAchievers.user.Role.MANAGER;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(
        AuthService service
    ) {
        return args -> {
            var admin = UserRequest.builder()
                    .firstName("Admin")
                    .lastName("Admin")
                    .email("admin@mail.com")
                    .password("password")
                    .role(ADMIN)
                    .build();
            System.out.println("Admin token: " + service.register(admin).getToken());

            var manager = UserRequest.builder()
                    .firstName("Admin")
                    .lastName("Admin")
                    .email("manager@mail.com")
                    .password("password")
                    .role(MANAGER)
                    .build();
            System.out.println("Manager token: " + service.register(manager).getToken());
        };

    }

}
