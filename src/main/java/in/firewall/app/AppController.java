package in.firewall.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping("/app")
    public String app() {
        return "New Spring Boot Reactive App!";
    }

}