


public class Testadora {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        // Adicionando tarefas
        Tarefas tarefa1 = new Tarefas("Estudar Java");
        Tarefas tarefa2 = new Tarefas("Fazer exercícios");
        Tarefas tarefa3 = new Tarefas("Ler um livro");

        lista.addTarefa(tarefa1);
        lista.addTarefa(tarefa2);
        lista.addTarefa(tarefa3);

        // Exibindo a lista de tarefas
        System.out.println("Lista de Tarefas:");
        for (Tarefas t : lista.getListaDeTarefas()) {
            System.out.println(t.getDescricao());
        }

        // Editando uma tarefa
        lista.editarTarefa(1, "Fazer exercícios de programação");

        // Exibindo a lista de tarefas após edição
        System.out.println("\nLista de Tarefas após edição:");
        for (Tarefas t : lista.getListaDeTarefas()) {
            System.out.println(t.getDescricao());
        }

        // Removendo uma tarefa
        lista.removerTarefa("Ler um livro");

        // Exibindo a lista de tarefas após remoção
        System.out.println("\nLista de Tarefas após remoção:");
        for (Tarefas t : lista.getListaDeTarefas()) {
            System.out.println(t.getDescricao());
        }

        System.out.println("Numero total de tarefas: ");
        System.out.println(lista.obterNumeroTotalDeTarefas());
    }
}
