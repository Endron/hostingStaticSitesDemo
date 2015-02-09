package io.github.endron.hostingStaticSitesDemo.controller;

import io.github.endron.hostingStaticSitesDemo.data.Book;
import io.github.endron.hostingStaticSitesDemo.data.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public Greeting greetMe() {
        return new Greeting(1, "hello");
    }
}
