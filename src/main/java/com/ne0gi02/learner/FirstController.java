package com.ne0gi02.learner;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String sayHello() {

        return ">> Hello from FirstController! <<";
    }

    @PostMapping("/post")
    public String post(
            @RequestBody String messsage) {
        return "Request accepted and message is: " + messsage;
    }
}
