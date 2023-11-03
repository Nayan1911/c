package com.example.gitlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@GetMapping
public class GitlabApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome";
    }

    public static void main(String[] args) {
        SpringApplication.run(GitlabApplication.class, args);
    }

}
