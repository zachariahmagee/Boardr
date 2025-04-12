package zm.explore.Boardr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "zm.explore.boardr")
public class BoardrApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardrApplication.class, args);
	}

}
