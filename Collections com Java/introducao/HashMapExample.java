//package introducao;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // Adicionar elementos
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // Acessar elementos
        System.out.println("Value for key 'Apple': " + map.get("Apple"));

        // Iterar sobre elementos
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Remover elementos
        map.remove("Banana");

        System.out.println("After removal: " + map);
    }
}
