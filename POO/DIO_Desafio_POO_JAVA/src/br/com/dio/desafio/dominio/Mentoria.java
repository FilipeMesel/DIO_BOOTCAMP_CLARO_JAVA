package br.com.dio.desafio.dominio;

import java.time.LocalDate;
/**
 * Classe filha de conteúdo
 * Tudo o que tem em Conteudo, tem em mentoria
 * Mas nem tudo que tem em mentoria, tem em conteudo.
 */
public class Mentoria extends Conteudo {

    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return XP_PADRAO+20d;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + ", xp=" + calcularXp() + "]";
    }
}
