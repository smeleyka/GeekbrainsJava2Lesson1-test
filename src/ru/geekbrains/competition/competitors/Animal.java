package ru.geekbrains.competition.competitors;

/**
 * Created by smeleyka on 24.04.17.
 */
public abstract class Animal implements Competitor{
    String name;
    String type;
    int maxRunLenght;
    int maxJumpHeight;
    int maxSwimLenght;
    boolean onDistance;



    public String getName() {
        return name;
    }

    public boolean isOnDistance() {return onDistance;}

    public Animal(String name, String type, int maxRunLenght, int maxJumpHeight, int maxSwimLenght) {
        this.name = name;
        this.type = type;
        this.maxRunLenght = maxRunLenght;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimLenght = maxSwimLenght;
        this.onDistance = true;
    }


    public void run(int runDist){
        if (runDist <= maxRunLenght){
            System.out.println(name + " "+type + " успешно пробежал дистанцию " + runDist);
        }
        else {
            System.out.println(name + type + " не смог пробежать дистанцию");
            onDistance = false;
        }
    }
    public void jump(int jumpDist) {
        if (jumpDist <= maxJumpHeight) {
            System.out.println(name + " "+ type + " успешно перепрыгнул препятствие " + jumpDist);
        } else {
            System.out.println(name + " "+ type + " не смог перепрыгнуть препятствие");
            onDistance = false;
        }
    }

    public void swim(int swimDist) {
        if (swimDist <= maxSwimLenght) {
            System.out.println(name + " "+ type + " успешно проплыл дистанцию " + swimDist);
        } else {
            System.out.println(name + " "+ type + " не смог проплыть дистанцию");
            onDistance = false;
        }
    }
}