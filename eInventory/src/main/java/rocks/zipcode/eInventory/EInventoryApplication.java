package rocks.zipcode.eInventory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import rocks.zipcode.eInventory.repositories.AssetsRepository;



@SpringBootApplication
public class EInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EInventoryApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(AssetsRepository repository) {
		return args -> {
			repository.save(new Assets());
			repository.save(new Assets());
			repository.save(new Assets());
		};
	}

}
