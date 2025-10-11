package com.morangoo.github.seed;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue="World") String name) {
        return "Hello, " + name + "!";
    }
}
