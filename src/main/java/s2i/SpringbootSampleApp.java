package s2i;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableConfigurationProperties
public class SpringbootSampleApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootSampleApp.class);


    public static void main(String[] args) {
        SpringApplication.run(SpringbootSampleApp.class, args);
    }

    @RequestMapping("/")
    public String home() {
        LOGGER.error("doStuff encountered an error with value - {}", "test");
        return "Welcome to your Springboot application on OpenShift!";
    }

}