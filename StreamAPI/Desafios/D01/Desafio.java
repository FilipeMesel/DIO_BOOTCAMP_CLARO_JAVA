package StreamAPI.Desafios.D01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio {
    public static void main(String[] args) {
        
        //Stream de coleções
        List<String> list = Arrays.asList("Amanda", "Boris", "Carlos", "Arthur");
        Stream<String> stream = list.stream();
        
        //Coletar os resultados em uma coleção.
        List<String> Filter = list.stream()
                          .filter(s -> s.startsWith("A"))
                          .collect(Collectors.toList()); //Operação final: Coletar os resultados em uma coleção.

        //Transformar elementos aplicando uma função.
        List<String> Map = Filter.stream()
                          .map(String::toUpperCase)
                          .collect(Collectors.toList()); //Operação final

        //Ordenar elementos.
        List<String> Sorted = Filter.stream()
            .sorted()
            .collect(Collectors.toList()); //Operação final
        
        //Operação final for..each: Executar uma ação para cada elemento.
        Sorted.stream().forEach(System.out::println);


    }
}
