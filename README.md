# Dicionário em Java utilizando Map

Este projeto implementa um dicionário simples em Java, utilizando a interface `Map` para armazenar palavras e suas respectivas definições. O programa oferece operações básicas como adicionar, remover, exibir e pesquisar palavras no dicionário.

## Funcionalidades

A classe `Dicionario` implementa as seguintes operações:

- **adicionarPalavra(String palavra, String definicao):** Adiciona uma palavra e sua definição ao dicionário.
- **removerPalavra(String palavra):** Remove uma palavra do dicionário.
- **exibirPalavras():** Exibe todas as palavras e suas definições armazenadas no dicionário.
- **pesquisarPorPalavra(String palavra):** Pesquisa uma palavra e retorna sua definição, se encontrada.

## Estrutura do Projeto

O projeto contém uma classe principal chamada `Dicionario`, onde o dicionário é gerido por meio de um `Map`. Esse `Map` pode ser uma instância de `HashMap`, que associa palavras a suas definições.

## Tecnologias Utilizadas

- Java (JDK 8 ou superior)
- HashMap para implementação de Map
