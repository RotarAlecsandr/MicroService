package ru.rotar.acceptmesseg.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rotar.acceptmesseg.model.Greetings;

@Repository
public interface GreetingsRepository extends JpaRepository<Greetings, Long> {
}
