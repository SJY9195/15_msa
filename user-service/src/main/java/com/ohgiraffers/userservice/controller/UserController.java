package com.ohgiraffers.userservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class UserController {

    @GetMapping("/{id}")
    public ResponseEntity getUserId(@PathVariable("id") String id){
        return ResponseEntity.ok("유저의 아이디는 " + id);
    }

}
