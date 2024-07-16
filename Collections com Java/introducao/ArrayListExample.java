// package introducao;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Adicionar elementos
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple"); // Permite duplicatas

        // Acessar elementos
        System.out.println("Element at index 0: " + list.get(0));

        // Iterar sobre elementos
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Remover elementos
        list.remove("Banana");

        System.out.println("After removal: " + list);
    }
}
