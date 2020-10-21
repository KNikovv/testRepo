package com.test.exampleapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class ExampleController {

    @GetMapping
    public ResponseEntity<String> getMembers() {
        return ResponseEntity.ok("Hi 20.10.2020");
    }

}