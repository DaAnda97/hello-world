package de.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HelloController {

    @Value("${de.demo.hello}")
    private String greetingMessage;

    @GetMapping("/hello")
    public String hello() {
        return greetingMessage;
    }
}
