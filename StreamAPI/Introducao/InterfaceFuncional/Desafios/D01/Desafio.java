package StreamAPI.Introducao.InterfaceFuncional.Desafios.D01;

public class Desafio {
    public static void main(String[] args) {
        Comparador comparasao1 = (a, b) -> a > b? a:b;
        int a = 5, b = 10;
        System.out.println("Maior: " + comparasao1.comparar(a, b));
    }
}
