package ru.rotar.acceptmesseg.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rotar.acceptmesseg.service.GreetingsService;


@RequiredArgsConstructor
@RestController
public class GreetingsController {

    private final GreetingsService greetingsService;

    @GetMapping("/message")
    public String getCount(){
        return "Hello accepted " + greetingsService.getCount() + " once";
    }

}
