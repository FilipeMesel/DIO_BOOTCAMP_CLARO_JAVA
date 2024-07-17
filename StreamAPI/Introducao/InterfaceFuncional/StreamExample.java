package StreamAPI.Introducao.InterfaceFuncional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Stream", "API", "Functional", "Interface");

        // Usando Function como interface funcional
        Function<String, Integer> calcularComprimento = String::length;

        List<Integer> comprimentos = palavras.stream()
                                             .map(calcularComprimento)
                                             .collect(Collectors.toList());

        System.out.println(comprimentos);
    }
}