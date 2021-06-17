package ru.geekbrains_Artjon_Islyamov;

public class Human implements Contestant {
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Human(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = 100;
        this.maxJumpHeight = 1;
    }

    @Override
    public boolean run(int distance) {
        if (distance < 0) {
            System.out.println(this + " не может бежать назад.");
            return false;
        } else if (distance >= maxRunDistance) {
            System.out.println("Дистаниця " + distance + " слишком большая для " + this);
            return false;
        } else {
            System.out.println(this + " успешно справляется с дистанцией в " + distance + " метров");
        }
        return true;

    }

    @Override
    public boolean jump(int height) {
        if (height < 0) {
            System.out.println(this + " не может прыгать назад.");
            return false;
        } else if (height >= maxJumpHeight) {
            System.out.println("Дистаниця " + height + " слишком большая " + this);
            return false;
        } else {
            System.out.println(this + " успешно справляется с дистанцией в " + height + " метров");
        }
        return true;

    }

    @Override
    public String toString() {
        return "Human";
    }

}
