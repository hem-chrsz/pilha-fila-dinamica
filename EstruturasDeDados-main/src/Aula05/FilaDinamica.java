package Aula05;

public class FilaDinamica {
    private No inicio;
    private No fim;
    private int tamanho;

    public FilaDinamica() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void inserir(int elemento) {
        No novoNo = new No(elemento);
        if (isEmpty()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
        tamanho++;
    }

    public void remover() {
        if (!isEmpty()) {
            inicio = inicio.getProximo();
            tamanho--;
            if (isEmpty()) {
                fim = null;
            }
        }
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void imprimir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}
