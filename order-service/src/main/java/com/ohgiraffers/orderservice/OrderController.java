package com.ohgiraffers.orderservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/{id}")
    public ResponseEntity getOrderId(@PathVariable("id") String id){
        System.out.println("1번 order-service 동작");
        return ResponseEntity.ok("오더 조회" + id);
    }
}
