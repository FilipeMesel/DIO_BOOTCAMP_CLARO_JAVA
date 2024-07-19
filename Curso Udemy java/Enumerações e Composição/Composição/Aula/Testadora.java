public class Testadora {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Flores", "São Paulo", "SP", "12345-678");
        Pessoa pessoa = new Pessoa("João", endereco);

        System.out.println(pessoa);
    }
}
