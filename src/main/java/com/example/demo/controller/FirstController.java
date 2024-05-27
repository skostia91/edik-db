package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class FirstController {

    private final UserRepository userRepository;


    @GetMapping
    public String hello() {
        System.err.println("hello");
        return "hello";
    }

    @GetMapping("/first")
    public ResponseEntity<List<User>> h2ello() {
        System.err.println("вход в userRepository.findAll()");
        return ResponseEntity.ok(userRepository.findAll());
    }
}
