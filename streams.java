
import java.util.*;
import java.util.stream.*;

public class streams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Pratap", "Amit", "Ravi", "Ajay");

        List<String> result = names.stream()
                                   .filter(name -> name.startsWith("A"))
                                   .map(String::toUpperCase)
                                   .sorted()
                                   .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
