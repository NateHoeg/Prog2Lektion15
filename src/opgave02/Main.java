package opgave02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        PeopleArray peopleArray = new PeopleArray();
        addPeople(peopleArray);
        System.out.println();

        //Opgave 2 del 1
        //Den første person der hedder Klaus
        System.out.println("Den første person der hedder Klaus: " + peopleArray.findFirst(p -> p.getName().equals("Klaus")));
        //Den første person der har et navn med længden 4
        System.out.println("Den første person der har et navn med længden 4: " + peopleArray.findFirst(p -> p.getName().length() == 4));
        //Indsæt kode herunder der kalder metoderne findFirst og findAll som beskrevet i opgave 1
        //Den første person der er 44 år
        System.out.println("Den første person der er 44 år: " + peopleArray.findFirst(p -> p.getAge() == 44));
        //Den første person hvis navn starter med 'S'
        System.out.println("Den første person hvis navn starter med 'S': " + peopleArray.findFirst(p -> p.getName().charAt(0) == 'S'));
        //Den første person der har et navn med mere end et 'i'
        System.out.println("Den første person der har et navn med mere end et 'i': " + peopleArray.findFirst(p -> {
            int i = 0;
            int iCount = 0;
            while(i < p.getName().length()) {
                if(p.getName().charAt(i) == 'i') {
                    iCount +=1;
                }
                i++;
            }
            if(iCount >= 2) {
                return true;
            }
            else {
                return false;
            }
        }));
        //Den første person hvis navnelængde er lig med alderen
        System.out.println("Den første person hvis navnelængde er lig med alderen: " + peopleArray.findFirst(p -> {
            if(p.getName().length() == p.getAge()) {
                return true;
            }
            else {
                return false;
            }
        }));



        //Opgave 2 del 2
        //Alle personer med et navn indeholdende 'i'
        System.out.println("Alle personer med et navn indeholdende 'i': " + peopleArray.findAll(p -> p.getName().contains("i")));
        //Alle personer med at navn startende med 's'
        System.out.println("Alle personer med at navn startende med 's': " + peopleArray.findAll(p -> p.getName().startsWith("S")));
        //Alle personer med et navn på længe 5
        System.out.println("Alle personer med et navn på længe 5: " + peopleArray.findAll(p -> p.getName().length() == 5));
        //Alle personer med alder på mindst 6 og max 40
        System.out.println("Alle personer med alder på mindst 6 og max 40: " + peopleArray.findAll(p -> {
            if(p.getAge() > 6 && p.getAge() <= 40) {
                return true;
            }
            else {
                return false;
            }
        }));

    }

    private static void addPeople(PeopleArray peopleArray) {
        peopleArray.addPerson(new Person("Bent", 25));
        peopleArray.addPerson(new Person("Susan", 34));
        peopleArray.addPerson(new Person("Mikael", 60));
        peopleArray.addPerson(new Person("Klaus", 44));
        peopleArray.addPerson(new Person("Birgitte", 17));
        peopleArray.addPerson(new Person("Liselotte", 9));
    }
}
