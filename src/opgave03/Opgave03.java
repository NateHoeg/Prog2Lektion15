package opgave03;

import java.util.ArrayList;
import java.util.List;

public class Opgave03 {
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

        //Udskriv en linie for hver løber med name og lapTime ved at bruge
        //List.forEach() metoden med en Consumer lambda.
        runners.forEach(r -> System.out.println(r.getName() + " " + r.getLapTime()));

        System.out.println();
        //Som 1 , men udskriv kun løberne med lapTime < 30.
        runners.forEach(r -> {
            if(r.getLapTime() < 30) {
                System.out.println(r.getName() + " " + r.getLapTime());
            }
        });

        System.out.println();

        //Sorter løberne stigende efter lapTime ved at bruge List.sort() metoden
        //med en Comparator lambda. Udskriv løberne.
        runners.sort((r1, r2) -> r1.getLapTime() - r2.getLapTime());
        System.out.println(runners);
    }
}
