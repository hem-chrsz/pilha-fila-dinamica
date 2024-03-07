package Aula05;

public class PrincipalFila {
    public static void main(String[] args) {
        FilaDinamica fila = new FilaDinamica();

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        fila.imprimir();

        fila.remover();

        fila.imprimir();

        System.out.println("Tamanho da fila: " + fila.tamanho());

        System.out.println("A fila está vazia? " + fila.isEmpty());
    }
}
