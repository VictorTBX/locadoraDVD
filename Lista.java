public class Lista {
  
  private Node fim;
  private Node inicio;
  private int quantidade;
  
  public Lista() {
    inicio = fim = null;
    quantidade = 0;
  }
  
  public boolean isEmpty() {
    return quantidade == 0;
  }
  
  public int size() {
    return quantidade;
  }
  
  public void addEnd(Node n) {
    if(isEmpty) {
      inicio = fim = n;
    } else {
      fim.setProximo(n);
      n.setAnterior(fim);
      n.setProximo(null);
      fim = n;      
    } quantidade++;
  }
  
  public Node remove(DVD dvd){
    if(isEmpty) {
      return 
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
