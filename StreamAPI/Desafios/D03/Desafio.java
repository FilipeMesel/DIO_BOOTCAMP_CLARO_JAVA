package StreamAPI.Desafios.D03;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Amanda");

        Map<Integer, List<String>> groupedByLength = names.stream()
                                                          .collect(Collectors.groupingBy(String::length));

        groupedByLength.forEach((length, nameList) -> {
            System.out.println("Length: " + length);
            nameList.forEach(System.out::println);
        });
        
    }
}
