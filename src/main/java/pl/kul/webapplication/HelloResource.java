package pl.kul.webapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
    @GetMapping(path = "/api/hello")
    public String helloFromTheServer() {
        return "Hello message from the server";
    }
}
