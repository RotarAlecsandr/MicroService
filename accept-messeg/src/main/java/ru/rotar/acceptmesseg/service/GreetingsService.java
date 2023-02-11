package ru.rotar.acceptmesseg.service;


import ru.rotar.acceptmesseg.model.Greetings;

public interface GreetingsService {
    void saveHello(Greetings message);

    Long getCount();

}
