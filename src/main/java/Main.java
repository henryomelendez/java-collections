import Model.*;
import Repo.DataRepo;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() { // Range of people
        // TODO...
        List<Person> personList = DataRepo.getPeople();
        personList = personList.stream().filter(x-> x.getAge() >= 20 && x.getAge() <= 40).collect(Collectors.toList());
        System.out.println(personList.toString());

    }

    private static void ex2() { // Average Displacement
        // TODO...

    }

    private static void ex3() { // People Uppercase
        // TODO...

    }

    private static void ex4() { // Word counter
        // TODO...

    }

    private static void ex5() { // Sorted word counter
        // TODO...

    }
}
