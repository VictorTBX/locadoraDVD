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
        if (isEmpty()) {
            inicio = fim = n;
        } else {
            fim.setProximo(n);
            n.setAnterior(fim);
            n.setProximo(null);
            fim = n;
        }
        quantidade++;
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
            throw new Error("DVD indisponível para venda.");
        }
        while (!(aux.getDvd().getCodigo() == codigo) && (aux != fim)) {
            aux = aux.getProximo();
        }
        if (aux == fim && !(aux.getDvd().getCodigo() == codigo)) {
            throw new Error("DVD indisponível para venda.");
        } else {
            if (aux.getDVD().getDisponivel() == false){
                throw new Error("DVD indisponível para venda.");
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
            System.out.println("DVD vendido com sucesso.");
            return aux;
        }        
    }
    
    public void alugar(String nome){
        Node aux = inicio;
        if (isEmpty()) {
            System.out.println("DVD não encontrado.");
        } else {
            while (aux.getDVD.getDisponivel() == false) {
                aux = aux.getProximo(); 
                while (!(aux.getDvd().getTitulo().equals(nome)) && (aux != fim)) {
                    aux = aux.getProximo();                
                }
            }            
            if (!(aux.getDvd().getTitulo().equals(nome)) && (aux == fim)) {
                System.out.println("DVD não encontrado.");
            } else {
                aux.getDvd().setDisponivel(false);
                System.out.println("DVD alugado com sucesso.");
            }
        }
    }
    
    public void devolver(String nome){
        Node aux = inicio;
        if (isEmpty()) {
            System.out.println("DVD não encontrado.");
        } else {
            while (aux.getDVD.getDisponivel() == true) {
                aux = aux.getProximo(); 
                while (!(aux.getDvd().getTitulo().equals(nome)) && (aux != fim)) {
                    aux = aux.getProximo();                
                }
            }
            if (!(aux.getDvd().getTitulo().equals(nome)) && (aux == fim)) {
                System.out.println("DVD não encontrado.");
            } else {
                aux.getDvd().setDisponivel(true);
                System.out.println("DVD devolvido com sucesso.");
            }
        }
    }
    
    public void disponibilidade(int codigo) {
        Node aux = inicio;        
        if (isEmpty()) {
            System.out.println("DVD não encontrado");
        } else {
            while ((aux.getDvd().getCodigo() != codigo) && (aux != fim)) {
                aux = aux.getProximo();
            }
            if (aux.getDvd().getCodigo() == codigo && (aux == fim)) {            
                if (aux.getDvd().getDisponivel()) {
                    System.out.println("DVD disponível"); 
                } else {
                    System.out.println("DVD indisponível"); 
                }                              
            } else {
                if (aux.getDvd().getCodigo() == codigo && (aux != fim)) {           
                if (aux.getDvd().getDisponivel()) {
                    System.out.println("DVD disponível"); 
                } else {
                    System.out.println("DVD indisponível"); 
                }
            } else {
                    if (aux.getDvd().getCodigo() != codigo) {
                        System.out.println("DVD não encontrado");
                    }                    
                }
        }
    }
}

    public void display() {
        Node aux = inicio;
        for (int i = 0; i < quantidade; i++) {
            System.out.print(aux + " ");
            if (aux.getProximo() != null) {
                aux = aux.getProximo();                        
            }
        }
        System.out.println("");
    }
}
