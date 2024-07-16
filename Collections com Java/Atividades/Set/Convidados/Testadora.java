public class Testadora {
    public static void main(String[] args) {
        ListaConvidados lista = new ListaConvidados();

        // Adicionando convidados
        Convidado convidado1 = new Convidado("Alice", 1001);
        Convidado convidado2 = new Convidado("Bob", 1002);
        Convidado convidado3 = new Convidado("Carol", 1003);

        lista.adicionarConvidado(convidado1);
        lista.adicionarConvidado(convidado2);
        lista.adicionarConvidado(convidado3);

        // Exibindo a lista de convidados
        System.out.println("Lista de Convidados:");
        for (Convidado c : lista.getConjuntoDeConvidados()) {
            System.out.println(c.getNome() + " - Convite nº " + c.getNumeroConvite());
        }

        // Buscando o nome do convidado pelo número do convite
        int numeroConviteBusca = 1002;
        String nomeConvidado = lista.buscarNomePorConvite(numeroConviteBusca);
        System.out.println("\nNome do convidado com convite " + numeroConviteBusca + ": " + nomeConvidado);

        // Removendo um convidado
        lista.removerConvidado(1002);

        // Exibindo a lista de convidados após remoção
        System.out.println("\nLista de Convidados após remoção:");
        for (Convidado c : lista.getConjuntoDeConvidados()) {
            System.out.println(c.getNome() + " - Convite nº " + c.getNumeroConvite());
        }

        // Obtendo número total de convidados
        System.out.println("\nNúmero total de convidados: " + lista.obterNumeroTotalDeConvidados());
    }
}
