package Aula05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        PilhaDinamica pilha = new PilhaDinamica();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);


        System.out.println("Dados da pilha:");
        pilha.imprimir();
        pilha.pop();

        System.out.println("Dados da pilha após remoção:");
        pilha.imprimir();

        System.out.println("Tamanho da pilha: " + pilha.size());

        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }
}
