package StreamAPI.Introducao.InterfaceFuncional.Desafios.D02;

public class Desafio {
    public static void main(String[] args) {
        StringToInt StoI = Integer::parseInt;

        int num2024 = StoI.StringToInt("2024");
        System.out.println("Convertendo 2024: "  + num2024);
    }
}
