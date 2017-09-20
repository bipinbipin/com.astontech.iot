package com.astontech.iot.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {

    @GetMapping("/api/hi")
    public String helloWorld() {
        return "H3!!0 W()R!D     -   002";
    }
}
