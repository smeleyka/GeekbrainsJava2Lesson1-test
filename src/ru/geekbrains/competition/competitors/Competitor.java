package ru.geekbrains.competition.competitors;

/**
 * Created by smeleyka on 24.04.17.
 */
public interface Competitor {
    String getName();
    boolean isOnDistance();
    void run(int runDist);
    void jump(int jumpDist);
    void swim(int swimDist);
}
