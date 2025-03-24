# Stack_System_ADS

Este projeto consiste em criar um sistema de pilhas utilizando somente vetores. O projeto foi desenvolvido em Java e contém duas classes principais: `EDD_24_03_Pilhas_Filas` e `Pilha`.

## Estrutura do Projeto

- `src/edd_24_03_pilhas_filas/EDD_24_03_Pilhas_Filas.java`: Classe principal que contém o método `main` para testar as operações da pilha.
- `src/edd_24_03_pilhas_filas/Pilha.java`: Classe que implementa a estrutura de dados pilha utilizando vetores.

## Funcionalidades

A classe `Pilha` possui as seguintes funcionalidades:

- `empilhar(int x)`: Adiciona um elemento no topo da pilha.
- `desempilhar()`: Remove o elemento do topo da pilha.
- `exibe()`: Exibe todos os elementos da pilha.
- `topo()`: Retorna o elemento do topo da pilha.
- `tamanho()`: Retorna o tamanho atual da pilha.
- `cheia()`: Verifica se a pilha está cheia.
- `vazia()`: Verifica se a pilha está vazia.

## Como Executar

1. Clone o repositório para a sua máquina local.
2. Abra o projeto em sua IDE de preferência.
3. Compile e execute a classe `EDD_24_03_Pilhas_Filas` para testar as operações da pilha.

## Exemplo de Uso

```java
public class EDD_24_03_Pilhas_Filas {
    public static void main(String[] args) {
        Pilha p1 = new Pilha(5); //define o tamanho da pilha e a instancia
        
        p1.empilhar(5);
        System.out.println(p1.topo()); // Output: 5
        p1.empilhar(6);
        p1.empilhar(2);
        p1.empilhar(1);
        p1.empilhar(12);
        p1.desempilhar();
        System.out.println(p1.topo()); // Output: 1
        System.out.println(p1.tamanho()); // Output: 4
        p1.exibe(); // Output: 5,6,2,1,
    }
}

```
Este projeto é uma atividade de Estrutura de Dados do IFSP. 