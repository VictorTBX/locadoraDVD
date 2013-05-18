public class DVD {
  private int codigo;
  private String titulo;
  private int ano;
  private String estilo;
  private boolean disponivel;
  
  public DVD(int codigo, String titulo, int ano, String estilo) {
    this.codigo = codigo;
    this.titulo = titulo;
    this.ano = ano;
    this.estilo = estilo;
  }
  
  public int getCodigo(){
    return codigo;
  }
  
  public void setCodigo(int codigo){
    this.codigo = codigo;
  }
  
  public String getTitulo(){
    return titulo;
  }
  
  public void setTitulo(String titulo){
    this.titulo = titulo;
  }
  
  public int getAno(){
    return ano;
  }
  
  public void setAno(int ano){
    this.ano = ano;
  }
  
  public String getEstilo(){
    return estilo;
  }
  
  public void setEstilo(String estilo){
    this.estilo = estilo;
  }
