package hw6;

import java.util.Scanner;

public class AnimalsApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double distanceRun = Math.random() * 200;
        double distanceSwim = Math.random() * 0;
        Cat cat = new Cat(distanceRun, distanceSwim);

        distanceRun = Math.random()*500;
        distanceSwim = Math.random()*10;
        Dog dog = new Dog(distanceRun, distanceSwim);


        System.out.println("Кошка пробежала: " + cat.getAnimalDistanceRun() +
                " м. \nСобака пробежала: " + dog.getAnimalDistanceRun() + " м.");

        System.out.println("Введите данные для сравнения длины дистанции:");
        double distance = scanner.nextDouble();

        System.out.println("Кошка выполняет пробежку (" + distance + "). Результат: " + cat.run(distance));
        System.out.println("Собака выполняет пробежку (" + distance + "). Результат: " + dog.run(distance));

        System.out.println("Кошка проплыла: " + cat.getAnimalDistanceSwim() +
                " м. \nСобака проплыла: " + dog.getAnimalDistanceSwim() + " м.");

        System.out.println("Введите данные для сравнения длины дистанции:");
        distance = scanner.nextDouble();

        System.out.println("Кошка проплыла (" + distance + "). Результат: " + cat.swim(distance));
        System.out.println("Собака проплыла (" + distance + "). Результат: " + dog.swim(distance));
    }
}

