import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListaConvidados {

    private Set<Convidado> ConjuntoDeConvidados = new HashSet<>();

    public Set<Convidado> getConjuntoDeConvidados() {
        return this.ConjuntoDeConvidados;
    }

    public void setConjuntoDeConvidados(Set<Convidado> conjuntoDeConvidados) {
        this.ConjuntoDeConvidados = conjuntoDeConvidados;
    }
    
    public void adicionarConvidado(Convidado c) {
        this.ConjuntoDeConvidados.add(c);
    }

    

    public void removerConvidado(int numeroConvite) {
        Iterator<Convidado> iterator = ConjuntoDeConvidados.iterator();
        while (iterator.hasNext()) {
            Convidado c = iterator.next();
            if (numeroConvite == c.getNumeroConvite()) {
                iterator.remove(); // Remove de forma segura usando Iterator
                return;
            }
        }
        System.out.println("Convidado não encontrado com número de convite: " + numeroConvite);
    }

    public int obterNumeroTotalDeConvidados() {
        return this.ConjuntoDeConvidados.size();
    }

    public String buscarNomePorConvite(int numeroConvite) {
        for (Convidado c : ConjuntoDeConvidados) {
            if (c.getNumeroConvite() == numeroConvite) {
                return c.getNome();
            }
        }
        return "Convidado não encontrado com número de convite: " + numeroConvite;
    }
}
