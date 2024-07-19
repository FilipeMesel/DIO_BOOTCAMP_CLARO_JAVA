# Enumerações

## O que é uma Enumeração?

Enumerações (ou enum) são tipos de dados que consistem em um conjunto fixo de constantes. São muito úteis quando precisamos representar um conjunto de valores pré-definidos, como dias da semana, estados de um processo, etc.

## Como declarar uma Enumeração?

```bash
public enum DiaDaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
}
public class TestEnum {
    public static void main(String[] args) {
        DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
        System.out.println("Hoje é: " + hoje);
        
        for (DiaDaSemana dia : DiaDaSemana.values()) {
            System.out.println(dia);
        }
    }
}

```

# Composição

## O que é Composição?

Composição é uma técnica de modelagem onde uma classe é composta por outras classes. Isso significa que uma classe pode ter como membros instâncias de outras classes, o que permite a criação de estruturas complexas a partir de componentes menores e mais simples.

## Exemplo

```bash
public class Endereco {
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    @Override
    public String toString() {
        return rua + ", " + cidade + ", " + estado + ", " + cep;
    }
}

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return nome + " mora em " + endereco;
    }

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Flores", "São Paulo", "SP", "12345-678");
        Pessoa pessoa = new Pessoa("João", endereco);

        System.out.println(pessoa);
    }
}

```