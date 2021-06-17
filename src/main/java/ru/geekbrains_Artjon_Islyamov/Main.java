package ru.geekbrains_Artjon_Islyamov;

public class Main {
    public static void main(String[] args) {
        Contestant[] contestants = {
                new Cat(300, 50),
                new Robot(350, 18),
                new Human(300, 50)
        };
        Obstacle[] obstacles = {
                new Treadmill(50),
                new Wall(5),
                new Treadmill(300)
        };

        for (Contestant contestant : contestants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.contest(contestant)) break;

            }

        }

    }
}



