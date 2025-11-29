package kjp.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This annotation tells Spring that this class handles incoming web requests
@RestController
public class HelloWorldController {

    // This annotation maps HTTP GET requests for the "/" path to this method
    @GetMapping("/")
    public String home() {
        return "Hello, Spring Boot Demo is running!";
    }

    // You can also add another endpoint
    @GetMapping("/hello")
    public String helloWorld() {
        return "Greetings from /hello endpoint!";
    }
}