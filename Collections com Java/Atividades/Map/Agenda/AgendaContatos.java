import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaContatos {

    private Map<String, Contato> agenda = new HashMap<>();

    public void adicionarContato(String nome, String telefone) {
        Contato novoContato = new Contato(nome, telefone);
        agenda.put(nome, novoContato);
    }

    public void removerContato(String nome) {
        agenda.remove(nome);
    }

    public void exibirContatos() {
        System.out.println("Lista de Contatos:");
        for (Contato contato : agenda.values()) {
            System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
        }
    }

    public void pesquisarPorNome(String nome) {
        if (agenda.containsKey(nome)) {
            Contato contato = agenda.get(nome);
            System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
        } else {
            System.out.println("Contato não encontrado para o nome: " + nome);
        }
    }

    public int getTotalContatos() {
        return agenda.size();
    }

    public void ordenarPorNome() {
        Map<String, Contato> agendaOrdenada = new TreeMap<>(agenda);
        agenda = agendaOrdenada;
    }

    public Map<String, Contato> getAgenda() {
        return agenda;
    }

    public void setAgenda(Map<String, Contato> agenda) {
        this.agenda = agenda;
    }
}
