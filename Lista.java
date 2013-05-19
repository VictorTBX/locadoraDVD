public class Lista {
    private Node inicio;
    private Node fim;
    private int quantidade;

    public Lista() {
        inicio = fim = null;
        quantidade = 0;
    }

    public int size() {
        return quantidade;
    }

    public boolean isEmpty() {
        return quantidade == 0;
    }

    public void addEnd(Node n) {
        if(isEmpty()) {
            inicio = fim = n;
        } else {
            fim.setProximo(n);
            n.setAnterior(fim);
            n.setProximo(null);
            fim = n;      
        } quantidade++;
    }

    public Node getBegin() {
        return inicio;
    }

    public Node getEnd() {
        return fim;
    } 

    public Node remove(DVD dvd) {
        String nome = dvd.getTitulo();
        Node aux = inicio;
        if (isEmpty()) {
            throw new Error("Lista Vazia");
        }
        while(aux.getDvd().getTitulo().equals(nome) && (aux != null)) {
            aux = aux.getProximo();
        }
        if (aux == null) {
            throw new Error("Valor não encontrado");
        } else {
            aux.getAnterior().setProximo(aux.getProximo());
            aux.getProximo().setAnterior(aux.getAnterior());
            return aux;
        }
    }

    public void display() {
        Node aux = inicio;
        for (int i = 0; i < quantidade; i++) {
            System.out.print(aux + " ");
            aux = aux.getProximo();
        }
        System.out.println("");
    }
}
