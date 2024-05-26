package co.develhope.Interceptor01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {
    @GetMapping
    public String getTime() {
        return "the local date and time are currently " + LocalDateTime.now().toString();
    }
}
