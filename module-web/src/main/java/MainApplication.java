import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.afiportal.*"})
@EntityScan(basePackages = {"com.afiportal.*"})
@EnableJpaRepositories(basePackages = {"com.afiportal.*"})
public class MainApplication {

    public static void main(String[] args) {

        SpringApplication.run(MainApplication.class);
    }
}
