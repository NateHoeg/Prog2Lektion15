package opgave04;

import opgave03.Runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Opgave04 {
    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.addAll(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)));
        System.out.println(runners);
        System.out.println();

        /*
        til opgave 4.1
        // OBS: Throws exception.
        for (Runner runner : runners) {
            if (runner.getLapTime() > 40)
                runners.remove(runner);
        }
         */

        //Opgave 4.2



        System.out.println(runners);
        System.out.println();

    }
}
