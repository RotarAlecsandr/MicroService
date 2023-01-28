package ru.rotar.acceptmesseg.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "hello")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Greetings {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "message")
    private String message;

    public Greetings(String message) {
        this.message = message;
    }
}