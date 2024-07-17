package StreamAPI.Introducao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        //Stream de coleções
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream();

        //Stream de arrays
        String[] array = {"a", "b", "c"};
        Stream<String> streamArray = Arrays.stream(array);

        //Stream de valores
        Stream<String> streamDeValores = Stream.of("a", "b", "c");

        //Operações intermediárias
        //Filter
        //Filtrar elementos com base em uma condição.
        List<String> Filter = list.stream()
                          .filter(s -> s.startsWith("a"))
                          .collect(Collectors.toList()); //Operação final: Coletar os resultados em uma coleção.

        //Map
        //Transformar elementos aplicando uma função.
        List<String> Map = list.stream()
                          .map(String::toUpperCase)
                          .collect(Collectors.toList()); //Operação final

        //Sorted
        //Ordenar elementos.
        List<String> Sorted = list.stream()
            .sorted()
            .collect(Collectors.toList()); //Operação final
        
        //Operação final for..each: Executar uma ação para cada elemento.
        list.stream().forEach(System.out::println);

        //Operação final reduce: Reduzir os elementos para um único valor.
        Optional<String> concatenated = list.stream()
                                    .reduce((s1, s2) -> s1 + s2);





    }
}
