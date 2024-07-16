


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListaTarefas {

    private List<Tarefas> ListaDeTarefas = new ArrayList<>();

    public List<Tarefas> getListaDeTarefas() {
        return this.ListaDeTarefas;
    }

    public void setListaDeTarefas(List<Tarefas> listaDeTarefas) {
        this.ListaDeTarefas = listaDeTarefas;
    }
    
    public void addTarefa(Tarefas t)
    {
        this.ListaDeTarefas.add(t);
    }

    public void removerTarefa(String descricao)
    {
        Iterator<Tarefas> iterator = ListaDeTarefas.iterator();
        while (iterator.hasNext()) {
            Tarefas t = iterator.next();
            if (descricao.equals(t.getDescricao())) {
                iterator.remove(); // Remove de forma segura usando Iterator
            }
        }
    }

    public void editarTarefa(int id, String novaDescricao)
    {
        this.ListaDeTarefas.get(id).setDescricao(novaDescricao);

    }

    public int obterNumeroTotalDeTarefas()
    {
        return this.ListaDeTarefas.size();
    }
}
