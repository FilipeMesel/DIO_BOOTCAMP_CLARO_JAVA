
public class Aula01 {
    public enum DiaDaSemana {
        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
    }
    public static void main(String[] args) {
        DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
        System.out.println("Hoje é: " + hoje);
        
        for (DiaDaSemana dia : DiaDaSemana.values()) {
            System.out.println(dia);
        }
    }
    
}
