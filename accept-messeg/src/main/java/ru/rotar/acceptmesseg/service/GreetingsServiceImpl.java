package ru.rotar.acceptmesseg.service;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import ru.rotar.acceptmesseg.model.Greetings;
import ru.rotar.acceptmesseg.repository.GreetingsRepository;

@Service
@RequiredArgsConstructor
public class GreetingsServiceImpl implements GreetingsService {

    private final GreetingsRepository greetingsRepository;


    @Override
    public void saveHello(Greetings greetings) {
        greetingsRepository.save(greetings);
    }

    @Override
    public Long getCount() {
        return greetingsRepository.count();
    }
}
