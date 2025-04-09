package rajam.sushi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SushiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SushiApplication.class, args);
		DiPractice di = ctx.getBean(DiPractice.class); // we get an error stating object is not there in the container created above
		// by default
		di.tch();
	}
}
