import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 25));
        pessoas.add(new Pessoa("Carlos", 30));
        pessoas.add(new Pessoa("Beatriz", 22));

        // Ordenar por idade usando Comparator
        Collections.sort(pessoas, new IdadeComparator());

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}