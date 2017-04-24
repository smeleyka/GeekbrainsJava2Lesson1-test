package ru.geekbrains.competition.competitors;

/**
 * Created by smeleyka on 24.04.17.
 */
public class Human implements Competitor{
    String name;
    int maxRunLenght;
    int maxJumpHeight;
    int maxSwimLenght;
    boolean active;


    @Override
    public String getName() {
        return name;
    }

    public boolean isOnDistance(){return active;}

    public Human(String name) {
        this.name = name;
        this.maxRunLenght = 3000;
        this.maxJumpHeight = 6;
        this.maxSwimLenght = 100;
        this.active = true;
    }
    public void run(int runDist){
        if (runDist <= maxRunLenght){
            System.out.println(name + " успешно пробежал дистанцию " + runDist);
        }
        else {
            System.out.println(name + " не смог пробежать дистанцию");
            active = false;
        }
    }
    public void jump(int jumpDist) {
        if (jumpDist <= maxJumpHeight) {
            System.out.println(name + " успешно перепрыгнул препятствие " + jumpDist);
        } else {
            System.out.println(name + " не смог перепрыгнуть препятствие");
            active = false;
        }
    }

    public void swim(int swimDist) {
        if (swimDist <= maxSwimLenght) {
            System.out.println(name + " успешно проплыл дистанцию " + swimDist);
        } else {
            System.out.println(name + " не смог проплыть дистанцию");
            active = false;
        }
    }
}
