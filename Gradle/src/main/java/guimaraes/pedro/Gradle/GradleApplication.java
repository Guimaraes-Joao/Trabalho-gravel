package guimaraes.pedro.Gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author João Pedro
 * @return Grandle project with dependecy
 */

@SpringBootApplication
public class GradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleApplication.class, args);

		System.out.println("Hello word com gradle");

	}

}
