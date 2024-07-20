package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    //Aqui os conteúdos são salvos em ordem
    //Não usou arraylist pois não pode haver conteúdos duplicados
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    /*
     * Quando o dev se inscreve num bootcamp, automaticamente todos os cursos do bootcamp
     * que ele se inscrever,vão para ele.
     */
    public void inscreverBootcamp(Bootcamp bootcamp){
        //System.out.println("\r\n" + bootcamp.getConteudos());
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        //Aqui estamos adicionando ao bootcamp o dev
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        //Pegando o primeiro conteúdo dos conteudos inscritos
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

        //Verificando se o conteúdo existe na lista de conteúdos inscritos
        if(conteudo.isPresent())
        {
            //Add em conteúdos concluidos e removendo de conteúdos inscritos
            //Aqui usa conteudo.get() pois conteudo é um Optional.
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp(){
        //Pegando o xp de cada conteúdo do set de conteúdos e somando
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

}
