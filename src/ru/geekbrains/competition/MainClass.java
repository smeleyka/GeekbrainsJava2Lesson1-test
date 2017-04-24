package ru.geekbrains.competition;

import ru.geekbrains.competition.competitors.*;
import ru.geekbrains.competition.obstacles.Cross;
import ru.geekbrains.competition.obstacles.Obstacle;
import ru.geekbrains.competition.obstacles.Wall;
import ru.geekbrains.competition.obstacles.Water;

/**
 * Created by smeleyka on 24.04.17.
 */
public class MainClass {
    public static void main(String[] args) {
        Competitor[] competitors = {new Cat("Барсик"), new Dog("Шарик"), new Human("Славка")};
        Obstacle[] obstacles = {new Wall(3), new Cross(1000), new Water(50)};

        Team one = new Team("Огурцы");


        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }


    }


}
