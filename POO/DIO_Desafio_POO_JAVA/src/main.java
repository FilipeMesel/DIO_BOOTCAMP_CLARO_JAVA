import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao do curso de Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao do curso de JS");
        curso2.setCargaHoraria(4);

        // System.out.println("\r\n" + curso1.toString());
        // //toString vem subentendido
        // System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descricao da mentoria de Java");
        mentoria1.setData(LocalDate.now());

        // System.out.println(mentoria1);

        /*
         * Polimorfismo
         * Tudo o que tem em conteúdo, tem em curso
         * Mas nem tudo que tem em Curso, tem em conteúdo.
         * Esse é o conceito de polimorfismo
         * Aqui temos uma classe abstrata mãe (conteúdo) e uma classe filha (curso)
         */
        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devFilipe = new Dev();
        devFilipe.setNome("Filipe");
        System.out.println("\r\n--------------FILIPE----------------");
        System.out.println("Conteudos inscritos" + devFilipe.getConteudosInscritos());
        devFilipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devFilipe.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devFilipe.getConteudosConcluidos());
        System.out.println("XP: " + devFilipe.calcularTotalXp());
        devFilipe.progredir();
        System.out.println("Conteudos inscritos" + devFilipe.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devFilipe.getConteudosConcluidos());
        System.out.println("XP: " + devFilipe.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        System.out.println("\r\n--------------JOAO----------------");
        System.out.println("Conteudos inscritos" + devJoao.getConteudosInscritos());
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        devJoao.progredir();
        System.out.println("Conteudos inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        
    }
}
