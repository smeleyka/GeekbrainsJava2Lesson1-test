package ru.geekbrains.competition.obstacles;

import ru.geekbrains.competition.competitors.Competitor;

/**
 * Created by smeleyka on 24.04.17.
 */
public class Water extends Obstacle{
    int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    public void doIt(Competitor o){
        o.swim(distance);
    }

}
