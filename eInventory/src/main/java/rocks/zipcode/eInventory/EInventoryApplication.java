package rocks.zipcode.eInventory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import rocks.zipcode.eInventory.Repositories.AssetsRepository;



@SpringBootApplication
public class EInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EInventoryApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(AssetsRepository repository) {
		return args -> {
			repository.save(new Assets("helmet", ageClassification.JUNIOR, Sizes.SMALL));
			repository.save(new Assets("elbowPad", ageClassification.SENIOR, Sizes.LARGE));
			repository.save(new Assets("shinPad", ageClassification.YOUTH, Sizes.MEDIUM));
		};
	}
}
