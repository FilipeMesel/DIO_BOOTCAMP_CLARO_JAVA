public class Aula02 {
    public enum DiaDaSemana {
        SEGUNDA("Segunda-feira"),
        TERCA("Terça-feira"),
        QUARTA("Quarta-feira"),
        QUINTA("Quinta-feira"),
        SEXTA("Sexta-feira"),
        SABADO("Sábado"),
        DOMINGO("Domingo");
    
        private String nome;
    
        DiaDaSemana(String nome) {
            this.nome = nome;
        }
    
        public String getNome() {
            return nome;
        }
    }
    public static void main(String[] args) {
        DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
        System.out.println("Hoje é: " + hoje.getNome());
    }
    
}
