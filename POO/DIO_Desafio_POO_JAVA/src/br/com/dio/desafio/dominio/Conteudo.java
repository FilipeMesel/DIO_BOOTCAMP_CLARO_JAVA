package br.com.dio.desafio.dominio;

/**
 * Todo bootcamp tem conteúdos
 * Cursos e Mentorias são conteúdos
 * Essa classe não pode ter objetos porque é abstrata (Conceito de herança)
 * Ela foi criada para evitar repetição de criação da função "calcularXp()" que será criada nas classes filhas
 */
public abstract class Conteudo {
    //Criando uma constante
    //O static informa que pode acessar a constante fora da classe "Conteudo"
    //Protected diz que só as classes filhas de conteudo podem acessar a constante
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXp();
}
