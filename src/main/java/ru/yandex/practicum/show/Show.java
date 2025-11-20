package ru.yandex.practicum.show;

import java.util.ArrayList;
import ru.yandex.practicum.people.Director;
import ru.yandex.practicum.people.Actor;

public class Show {
    private String title;
    private int minuteDuration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int minuteDuration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.minuteDuration = minuteDuration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println();
    }

    public void addNewActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актёр уже есть! В добавлении отказано.");
            return;
        }
        listOfActors.add(actor);
        System.out.println("Актер успешно добавлен.");
    }

//    В случае, если есть несколько актеров с одинаковой фамилией, то заменён будет первый, который идет в ArrayList.
//    Добавил вывод найденного актера, чтобы было видно, какой будет заменён.
//    Если нужно модифицировать функцию для более гибкого удаления, сделаю.
    public void replaceActorBySurname(Actor newActor, String oldActorSurname) {
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(oldActorSurname)) {
                System.out.println("Результат поиска по фамилии:");
                System.out.println(actor);
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                System.out.println("Замена актёров произошла успешно.");
                return;
            }
        }
        System.out.println("Актёр с данной фамилией не найден.");
    }
}
