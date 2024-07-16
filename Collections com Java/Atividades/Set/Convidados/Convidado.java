public class Convidado {
    private String nome;
    private int numeroConvite;

    public Convidado(String nome, int numeroConvite) {
        this.nome = nome;
        this.numeroConvite = numeroConvite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConvite() {
        return numeroConvite;
    }

    public void setNumeroConvite(int numeroConvite) {
        this.numeroConvite = numeroConvite;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(numeroConvite);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        return numeroConvite == other.numeroConvite;
    }
}
