//package introducao;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Adicionar elementos
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Ignorado, já que "Apple" já existe

        // Iterar sobre elementos
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Remover elementos
        set.remove("Banana");

        System.out.println("After removal: " + set);
    }
}
