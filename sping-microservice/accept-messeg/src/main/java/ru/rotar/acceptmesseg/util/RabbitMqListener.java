package ru.rotar.acceptmesseg.util;

import lombok.RequiredArgsConstructor;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import ru.rotar.acceptmesseg.model.Greetings;
import ru.rotar.acceptmesseg.service.GreetingsService;

@EnableRabbit
@Component
@RequiredArgsConstructor
public class RabbitMqListener {

    private final GreetingsService greetingsService;

    @RabbitListener(queues = "myQueue")
    public void processMyQueue(String message) {
        greetingsService.saveHello(new Greetings(message));
    }
}
