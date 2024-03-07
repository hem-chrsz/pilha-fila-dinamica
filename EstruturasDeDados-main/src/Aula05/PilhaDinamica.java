package Aula05;

public class PilhaDinamica {

    private No topo;
    private int tamanho;

    public PilhaDinamica(){
        this.topo = null;
        this.tamanho = 0;
    }

    public void push(int elemento){
        No noAux = new No(elemento);
        noAux.setProximo(this.topo);
        this.topo = noAux;
        this.tamanho++;
    }

    public void pop(){
        if (!isEmpty()) {
            No noAux = this.topo;
            this.topo = noAux.getProximo();
            noAux.setProximo(null);
            this.tamanho--;
        } else {
            System.out.println("A pilha está vazia.");
        }
    }

    public int size() {
        return this.tamanho;
    }


    public boolean isEmpty() {
        return this.topo == null;
    }

    public void imprimir() {
        No temp = this.topo;
        while (temp != null) {
            System.out.print(temp.getElemento() + " ");
            temp = temp.getProximo();
        }
        System.out.println();
    }
}
