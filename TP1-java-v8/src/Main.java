import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        //Question 1 :
        System.out.println("Question1");
        List<String> listStrings = new ArrayList<>();
        listStrings.add("ENSAO");
        listStrings.add("ENSA");
        listStrings.add("EST");

        listStrings.stream().filter(s -> s.contains("ENSA")).forEach(System.out::println);

        //Question 2:
        System.out.println("Question2");
        List<String> listStrings2 = new ArrayList<>();
        listStrings2.add("ENSAO");
        listStrings2.add("ENSA");
        listStrings2.add("EST");

        System.out.println(listStrings2.stream().collect(Collectors.joining(", ")));

        //Question 3
        System.out.println("Question3");
        List<String> listStrings3 = new ArrayList<>();
        listStrings3.add("ENSAO");
        listStrings3.add("ENSAO");
        listStrings3.add("EST");

        listStrings3.stream().collect(Collectors.toSet()).forEach(System.out::println);

        //Question 4
        System.out.println("Question4");
        List<String> listStrings4 = new ArrayList<>();
        listStrings4.add("ENSAO");
        listStrings4.add("ENSA");
        listStrings4.add("EST");

        System.out.println(listStrings4.stream().anyMatch(s -> s.contains("ENSA")));

        //Question 5
        System.out.println("Question5");
        IntStream stream = IntStream.of(4, 5, 6, 7);

        // Using IntStream summaryStatistics()
        IntSummaryStatistics summary_data =
                stream.summaryStatistics();

        // Displaying the various summary data
        // about the elements of the stream
        System.out.println(summary_data);

        //Question 6
        System.out.println("Question6");
        List<Person> people = Arrays.asList(new Person("Boulouane", 23),
                new Person("Chahid", 21),
                new Person("Benziza", 22));
        Collections.sort(people);
        people.stream().map(Person::getName).forEach(System.out::println);

        List<Person> people2 = Arrays.asList(new Person("Chahid", 21),
                new Person("Boulouane", 23),
                new Person("Benziza", 22));

        people2
                .stream()
                .collect(Collectors.groupingBy(Person::getAge,Collectors.mapping(Person::getName,Collectors.toList())))
                .forEach((key, value) -> {System.out.println(key + " = " + value);});
    }
}