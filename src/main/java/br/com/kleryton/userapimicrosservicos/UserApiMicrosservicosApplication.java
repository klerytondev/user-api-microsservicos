package br.com.kleryton.userapimicrosservicos;

import br.com.kleryton.userapimicrosservicos.domain.User;
import br.com.kleryton.userapimicrosservicos.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiMicrosservicosApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiMicrosservicosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(
				new User(null, "Kleryton de Souza",
						"kleryton_inside@hotmail.com", "123", 20.0)));

	}
}
