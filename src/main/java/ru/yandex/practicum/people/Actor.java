package ru.yandex.practicum.people;

import ru.yandex.practicum.people.gender.Gender;

import java.util.Objects;

public class Actor extends Person {
    private int centimeterHeight;

    public Actor(String name, String surname, Gender gender, int centimeterHeight) {
        super(name, surname, gender);
        this.centimeterHeight = centimeterHeight;
    }

    @Override
    public String toString() {
        return "Актёр: " +
                "имя = " + super.getName() + ", " +
                "фамилия = " + super.getSurname() +
                " (" + centimeterHeight + ").";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return centimeterHeight == actor.centimeterHeight
                && super.getName().equals(actor.getName())
                && super.getSurname().equals(actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(centimeterHeight, super.getName(), super.getSurname());
    }
}
