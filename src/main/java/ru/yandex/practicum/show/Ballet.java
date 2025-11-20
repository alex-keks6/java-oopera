package ru.yandex.practicum.show;

import ru.yandex.practicum.people.Actor;
import ru.yandex.practicum.people.Director;
import ru.yandex.practicum.people.Person;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title, int minuteDuration, Director director, ArrayList<Actor> listOfActors,
                  Person musicAuthor, String librettoText, Person choreographer) {
        super(title, minuteDuration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
