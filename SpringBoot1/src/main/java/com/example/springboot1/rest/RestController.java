package com.example.springboot1.rest;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/")
public String sayHello(){
    return "Hello World! My self Mayank";
}

}
