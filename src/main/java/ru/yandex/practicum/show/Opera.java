package ru.yandex.practicum.show;

import ru.yandex.practicum.people.Actor;
import ru.yandex.practicum.people.Director;
import ru.yandex.practicum.people.Person;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int minuteDuration, Director director, ArrayList<Actor> listOfActors,
                 Person musicAuthor, String librettoText, int choirSize) {
        super(title, minuteDuration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
