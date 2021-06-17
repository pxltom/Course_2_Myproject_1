package ru.geekbrains_Artjon_Islyamov;

public class Wall implements Obstacle {
    private final int height;

    Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean contest(Contestant contestant) {
        if (contestant.jump(height)) {
            System.out.println(contestant + " перепрыгнул стену!");
            return true;
        } else {
            System.out.println(contestant + " не смог перепрыгнуть стену!");
            return false;
        }
    }
}

