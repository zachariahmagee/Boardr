package zm.explore.Boardr;

import org.springframework.boot.SpringApplication;

public class TestBoardrApplication {

	public static void main(String[] args) {
		SpringApplication.from(BoardrApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
