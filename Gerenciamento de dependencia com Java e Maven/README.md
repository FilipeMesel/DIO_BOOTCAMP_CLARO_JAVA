# Gerenciamento de dependencias com Maven

## Conceito

Ferramenta para gerenciar build e dependências de um projeto. Empacota a aplicação em um formato específico, compila os códigos fonte e executa os testes.

Endereça como o software foi construído e suas dependências através do POM (Project Object Model).

## Instaçaão

1. https://maven.apache.org/download.cgi
2. Extraia o arquivo .zip baixado e copie o caminho do .bin
3. Acesse as variáveis de ambiente e busque por "path" na tela de baixo
4. Precione "Editar" e depois "Novo"
5. Cole o caminho de .bin
6. Abra o cmd e digite "mvn --version"


## Iniciando um projeto com um template pronto:

```bash
mvn archetype:generate -DgroupId=one.digitalinovation -DartifactId=quick-start-maven -Darchetype=maven-archetype-quick-start -DinteractiveMode=false
```

# Comandos básicos

## Compilar

```bash
mvn compile
```

## Testar

Executa todos os testes da aplicação

```bash
mvn test
```

## Empacotar

Cria o .jar na pasta target

```bash
mvn package
```

## Limpar o diretório de trabalho

Limpa a pasta target

```bash
mvn clean
```

## Maven archetype

Templete que possibilita personalizar e configurar como o projeto será construído. Organização da versão de componentes; quais serão utilizados; organização de pacotes e de arquivos

```bash
https://maven.apache.org/archetypes/index.html
```

# POM (Project Object Model)

- Unidade fundamental de trabalho do apache maven; 
- Utiliza o formato xml;
- Detalha o projeto;
- Detalha como construir o projeto;
- Maven sempre procura pelo POM.xml para realizar sua execução

## Publicar o projeto localmente como um componente

Vá até a raíz do projeto e digite:

```bash
mvn install
```

Isso torna o projeto uma dependencia passível de uso.

## Dependências diretas x Dependências transitivas

São dependências declaradas no POM.xml. Dependências transitivas são obrigatórias das dependências declaradas no pom.xml.

## Buscar o classpath produzido pelo escopo compile

```bash
mvn dependency:build-classpath -DincludeScope=compile
```

## Buscar o classpath produzido pelo escopo teste

```bash
mvn dependency:build-classpath -DincludeScope=test
```

## Ciclo de vida do projeto maven
default, clean, site

