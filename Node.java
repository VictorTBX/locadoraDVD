public class Node {
  private DVD dvd;
  private Node proximo;
  private Node anterior;
  
  public Node(DVD dvd) {
    this.dvd = dvd;
    proximo = null;
    anterior = null;
  }
  
  
