public class Testadora {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        // Adicionando contatos
        agenda.adicionarContato("Alice", "1111-1111");
        agenda.adicionarContato("Bob", "2222-2222");
        agenda.adicionarContato("Carol", "3333-3333");

        // Exibindo a lista de contatos
        agenda.exibirContatos();

        // Pesquisando por nome
        System.out.println("\nPesquisando por nome:");
        agenda.pesquisarPorNome("Bob");

        // Ordenando por nome
        agenda.ordenarPorNome();

        // Exibindo a lista de contatos após ordenação
        System.out.println("\nLista de Contatos após ordenação por nome:");
        agenda.exibirContatos();

        // Removendo um contato
        agenda.removerContato("Alice");

        // Exibindo a lista de contatos após remoção
        System.out.println("\nLista de Contatos após remoção:");
        agenda.exibirContatos();

        // Obtendo número total de contatos
        System.out.println("\nTotal de contatos na agenda: " + agenda.getTotalContatos());
    }
}
