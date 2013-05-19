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

    public Node vender(int codigo) {
        Node aux = inicio;
        if (isEmpty()) {
            throw new Error("Lista Vazia");
        }
        while (!(aux.getDvd().getCodigo() == codigo) && (aux != fim)) {
            aux = aux.getProximo();
        }
        if (aux == fim && !(aux.getDvd().getCodigo() == codigo)) {
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
    
    public void alugar(String nome){
        Node aux = inicio;
        if (isEmpty()) {
            System.out.println("DVD não encontrado.");
        } else {
            while (!(aux.getDvd().getTitulo().equals(nome)) && (aux != fim)) {
                aux = aux.getProximo();
            }
            if (!(aux.getDvd().getTitulo().equals(nome)) && (aux == fim)) {
                System.out.println("DVD não encontrado.");
            } else {
                aux.getDvd().setDisponivel(false);
            }
        }
    }
    
    public void devolver(String nome){
        Node aux = inicio;
        if (isEmpty()) {
            System.out.println("DVD não encontrado.");
        } else {
            while (!(aux.getDvd().getTitulo().equals(nome)) && (aux != fim)) {
                aux = aux.getProximo();
            }
            if (!(aux.getDvd().getTitulo().equals(nome)) && (aux == fim)) {
                System.out.println("DVD não encontrado.");
            } else {
                aux.getDvd().setDisponivel(true);
            }
        }
    }
    
    public void disponibilidade(DVD dvd) {
        if(dvd.getDisponivel()) {
            System.out.println("DVD está disponível.");
        } else {
            System.out.println("DVD não está disponível.");
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
