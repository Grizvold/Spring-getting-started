import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Say Hello to the World Hen!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}
