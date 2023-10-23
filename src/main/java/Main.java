import Model.*;
import Repo.DataRepo;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ex3();
    }
    private static void ex1() { // Range of people
        // TODO...
        List<Person> personList = DataRepo.getPeople();
        personList = personList.stream().filter(x-> x.getAge() >= 20 && x.getAge() <= 40).collect(Collectors.toList());
        System.out.println(personList.toString());
    }
    private static void ex2() { // Average Displacement
        // TODO...
        double res = 0;
        List<Car> cars = DataRepo.getCarsWithEngines();
        res = cars.stream().mapToDouble(x -> x.getEngine().getDisplacment()).average().orElse(0);
        System.out.printf("%.02f",res);
    }
    private static void ex3() { // People Uppercase
        // TODO...
        List<Person> personList = DataRepo.getPeople();
        personList = personList.stream().map(x -> new Person(x.getId(), x.getFirstName().toUpperCase(), x.getLastName().toUpperCase(), x.getAge()))
                .collect(Collectors.toList());
        System.out.println(personList.toString());
    }

    private static void ex4() { // Word counter
        // TODO...

    }

    private static void ex5() { // Sorted word counter
        // TODO...

    }
}
