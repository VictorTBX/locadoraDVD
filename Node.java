public class Node {
  private DVD dvd;
  private Node proximo;
  private Node anterior;
  
  public Node(DVD dvd) {
    this.dvd = dvd;
    proximo = null;
    anterior = null;
  }
  
  public DVD getDvd() {
    return dvd;
  }
  
  public void setDvd(DVD dvd){
    this.dvd = dvd;
  }
  
  public Node getProximo() {
    return proximo;
  }
  
  public void setProximo(Node proximo){
    this.proximo = proximo;
  }
  
  public Node getAnterior() {
    return anterior;
  }
  
  public void setAnterior(Node anterior){
    this.anterior = anterior;
  }
}
