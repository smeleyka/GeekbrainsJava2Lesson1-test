package ru.geekbrains.competition.obstacles;

import ru.geekbrains.competition.competitors.Competitor;

/**
 * Created by smeleyka on 24.04.17.
 */
public class Wall extends Obstacle{
    int height;

    public Wall(int height) {
        this.height = height;
    }

    public void doIt(Competitor o){
        o.jump(height);
    }
}
