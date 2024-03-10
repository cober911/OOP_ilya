package Seminar5.seminar;

import Seminar5.seminar.animals.Lion;
import Seminar5.seminar.animals.Snake;
import Seminar5.seminar.cage.LionCage;
import Seminar5.seminar.animals.Wolf;
import Seminar5.seminar.cage.SnakeCage;
import Seminar5.seminar.cage.WolfCage;
import Seminar5.seminar.terminal.command.ParseCommand;
import Seminar5.seminar.terminal.TerminalReader;
import Seminar5.seminar.zoo.Zoo;


import java.util.List;


import static Seminar5.seminar.terminal.factory.LionsFactory.lionsCollection;
import static Seminar5.seminar.terminal.factory.SnakesFactory.snakesCollection;
import static Seminar5.seminar.terminal.factory.WolvesFactory.wolvesCollection;

public class Main {
    public static void main(String[] args) {
        List<Lion> lions = lionsCollection(2);
        LionCage lionsInCage = new LionCage(lions);

        lionsInCage.sortLions();
        System.out.println(lionsInCage);
        lionsInCage.getAnimalFromCage();
//        lionsInCage.sortByLionMane();

        List<Snake> snakes = snakesCollection(2);
        SnakeCage snakesInCage = new SnakeCage(snakes);
        snakesInCage.sortSnakes();
        System.out.println(snakesInCage);


        List<Wolf> wolves = wolvesCollection(2);
        WolfCage wolvesInCage = new WolfCage(wolves);
        wolvesInCage.sortWolves();
        System.out.println(wolvesInCage);
        wolvesInCage.getAnimalFromCage();
        wolvesInCage.sortByAgeAndWeight();
//        sortAnimalByAge(wolves);

        Zoo zoo = new Zoo(lionsInCage, wolvesInCage, snakesInCage);
        TerminalReader terminalReader = TerminalReader.newTerminalReader(new ParseCommand(),zoo);
        terminalReader.endless();

    }
}
