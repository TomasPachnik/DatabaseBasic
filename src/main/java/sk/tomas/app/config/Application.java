package sk.tomas.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Tomas Pachnik on 27-Feb-17.
 */

@SpringBootApplication
@ImportResource("classpath:application-context.xml")
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class);
    }

}
