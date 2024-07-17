# Descrição

Utiliza o paradigma funcional para operar na linguagem Java. É uma opção diferente de manipular coleções em Java. Processa coleções de maneira declarativa. Permite realizar operações de filtragem, mapeamento, redução de forma mais concisa e eficiente.

## Stream

Sequencia de elementos que suporta diferentes tipos de processamento de dados. Uma Stream **NÃO** armazena dados. Apenas opera dados quando são solicitados.

**Operações Intermediárias**

São operações que retornam outra Stream; permitindo encadeamneto de operações.

Exemplos:

- filter() 
- map()
- flatMap() 
- distinct()
- sorted()
- peek()
- limit()
- skip()

**Operações Finais**

São operações que produzem um resultado ou efeito colateral e finalizam o pipeline da Stream.

Exemplos: 
- collect()
- forEach()
- reduce()
- count()
- findFirst()
- findAny()
- anyMatch()
- allMatch()
- noneMatch()

## Funcional Interface

A anotação **@FunctionalInterface** em Java é usada para marcar uma interface como funcional. Uma interface funcional é uma interface que possui exatamente um método abstrato, tornando-a adequada para uso em expressões lambda e referências de método.

**Benefícios de Usar @FunctionalInterface**

1. Verificação em Tempo de Compilação: Garante que a interface tenha exatamente um método abstrato. Se mais métodos abstratos forem adicionados, o compilador gerará um erro.

2. Documentação: Indica claramente que a interface foi projetada para ser uma interface funcional.

**Requisitos para uma Interface Funcional**

1. Deve ter exatamente um método abstrato.
2. Pode ter métodos default e static.
3. Pode ter métodos da classe Object, como equals(), hashCode(), toString().