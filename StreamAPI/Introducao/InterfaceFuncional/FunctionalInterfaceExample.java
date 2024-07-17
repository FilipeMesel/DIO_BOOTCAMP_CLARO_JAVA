package StreamAPI.Introducao.InterfaceFuncional;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Usando lambda expression
        Operacao adicao = (a, b) -> a + b;
        Operacao multiplicacao = (a, b) -> a * b;

        System.out.println("Adição: " + adicao.executar(5, 3));
        System.out.println("Multiplicação: " + multiplicacao.executar(5, 3));
    }
}
