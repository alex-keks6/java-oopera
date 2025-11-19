package ru.yandex.practicum.people;

import ru.yandex.practicum.people.gender.Gender;

public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Режиссер: " +
                "имя = " + super.getName() + ", " +
                "фамилия = " + super.getSurname() +
                '.';
    }
}
