package ru.yandex.practicum.show;

import ru.yandex.practicum.people.Actor;
import ru.yandex.practicum.people.MusicAuthor;
import ru.yandex.practicum.people.Director;

import java.util.ArrayList;

public class MusicalShow extends Show {
    private MusicAuthor musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int minuteDuration, Director director,
                       ArrayList<Actor> listOfActors, MusicAuthor musicAuthor, String librettoText) {
        super(title, minuteDuration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
