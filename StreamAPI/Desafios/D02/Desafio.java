package StreamAPI.Desafios.D02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio {
    public static void main(String[] args) {
        
        //Stream de coleções
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int num = list.stream()
                .filter(n -> n%2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of even numbers: " + num);
    }
}
