package ru.geekbrains.competition.obstacles;


import ru.geekbrains.competition.competitors.Competitor;

/**
 * Created by smeleyka on 24.04.17.
 */
public class Cross extends Obstacle{
    int lenght;

    public Cross(int lenght) {
        this.lenght = lenght;
    }

    public void doIt(Competitor o){
        o.run(lenght);
    }
}
