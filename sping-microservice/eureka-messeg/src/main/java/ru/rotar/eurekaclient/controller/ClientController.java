package ru.rotar.eurekaclient.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ClientController {

    private final AmqpTemplate amqpTemplate;

    @GetMapping("/hello")
    public String Message(){
        amqpTemplate.convertAndSend("myQueue", "Hello");
        return "Hello";
    }
}
