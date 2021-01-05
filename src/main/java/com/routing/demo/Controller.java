package com.routing.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Controller {
    @RequestMapping("/users/{num}")
    public String dojo(@PathVariable("num") String name) {
        return "The " +name+ " is awesome!";
    }
}
