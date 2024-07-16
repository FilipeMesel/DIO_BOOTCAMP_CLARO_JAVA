//package introducao;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // Adicionar elementos
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

        // Acessar e remover elementos
        System.out.println("Head of queue: " + queue.peek());
        queue.poll();
        System.out.println("After poll: " + queue);
    }
}
