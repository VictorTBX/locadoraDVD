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

    public Node remove(String nome) {
        Node aux = inicio;
        if (isEmpty()) {
            throw new Error("Lista Vazia");
        }
        while (!(aux.getDvd().getTitulo().equals(nome)) && (aux != fim)) {
            aux = aux.getProximo();
        }
        if (aux == fim && !(aux.getDvd().getTitulo().equals(nome))) {
            throw new Error("Valor não encontrado");
        } else {
            if (aux.getProximo() != null && aux.getAnterior() != null) {
                aux.getAnterior().setProximo(aux.getProximo());
                aux.getProximo().setAnterior(aux.getAnterior());

            } else {
                if (aux.getProximo() == null && aux.getAnterior() == null) {
                    fim = inicio = null;
                } else {
                    if (aux == inicio) {
                        aux.getProximo().setAnterior(null);
                        inicio = aux.getProximo();
                    } else {
                        aux.getAnterior().setProximo(null);
                        fim = aux.getAnterior();
                    }
                }
            }
        }
        quantidade--;
        return aux;
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
