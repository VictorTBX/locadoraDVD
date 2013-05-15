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
      fim = novo;      
    } quantidade++;
  }
}
