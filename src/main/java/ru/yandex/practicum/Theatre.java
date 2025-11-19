package ru.yandex.practicum;

import ru.yandex.practicum.people.*;
import ru.yandex.practicum.people.gender.Gender;
import ru.yandex.practicum.show.Ballet;
import ru.yandex.practicum.show.Opera;
import ru.yandex.practicum.show.Show;

import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Пётр", "Петров", Gender.MALE, 160);
        Actor actor3 = new Actor("Елена", "Еленовна", Gender.FEMALE, 176);
        Director director1 = new Director("Алексей", "Гениалов", Gender.MALE, 0);
        Director director2 = new Director("Марина", "Креатиновна", Gender.FEMALE, 2);
        Choreographer choreographer = new Choreographer("Мигель", "Плавнов", Gender.MALE);
        MusicAuthor musicAuthor = new MusicAuthor("Варвара", "Музыкалова", Gender.FEMALE);
        Show show = new Show("Легендарное", 156, director1, new ArrayList<>());
        Opera opera = new Opera("Оперная", 144, director2, new ArrayList<>(), musicAuthor,
                "Оперный текст либретто", 15);
        Ballet ballet = new Ballet("Балетный", 132, director1, new ArrayList<>(), musicAuthor,
                "Балетный текст либретто", choreographer);

        show.addNewActor(actor1);
        opera.addNewActor(actor2);
        opera.addNewActor(actor3);
        ballet.addNewActor(actor1);
        ballet.addNewActor(actor2);
        ballet.addNewActor(actor3);
        System.out.println();
        show.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();

        // заменяем actor3 на actor1
        opera.replaceActorBySurname(actor1, "Еленовна");
        opera.printListOfActors();

        show.replaceActorBySurname(actor2, "Неизвестнов");
        show.printListOfActors();

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
