package com.technext.spring.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {
    @GetMapping("/testSwagger2")
    @ResponseBody
    public ResponseEntity<String> sayHello(){

        return ResponseEntity.ok().body("Spring Boot 2.4.5 with Swagger 3.0.0. is up & running..");
    }
}
