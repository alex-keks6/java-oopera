package ru.yandex.practicum.show;

import ru.yandex.practicum.people.Actor;
import ru.yandex.practicum.people.Choreographer;
import ru.yandex.practicum.people.Director;
import ru.yandex.practicum.people.MusicAuthor;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Choreographer choreographer;

    public Ballet(String title, int minuteDuration, Director director, ArrayList<Actor> listOfActors,
                  MusicAuthor musicAuthor, String librettoText, Choreographer choreographer) {
        super(title, minuteDuration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
