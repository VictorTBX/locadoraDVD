
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {       
        
      Scanner in = new Scanner(System.in);
        
        int resp, codigo;
        String nome;        
        Lista lista = new Lista();
        do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar dvd");
            System.out.println("2 - Verificar disponibilidade do filme");
            System.out.println("3 - Locação de DVD");
            System.out.println("4 - Devolução de DVD");
            System.out.println("5 - Venda de DVD");
            System.out.println("6 - Sair");

            resp = in.nextInt();
            switch (resp) {
                case 1:
                 
                    
                    System.out.println("Digite o codigo do DVD");
                    codigo = in.nextInt();
                    System.out.println("Digite o titulo do filme: ");
                    String titulo = in.next();                    
                    System.out.println("Digite o ano do filme: ");
                    int ano = in.nextInt();                    
                    System.out.println("Digite o estilo do filme: ");
                    String estilo = in.next();                    
                    System.out.println();
                    System.out.println("Filme adicionado com sucesso.");
                    DVD dvd= new DVD(codigo, titulo, ano, estilo);                    
                    Node aux = new Node(dvd);                                   
                    lista.addEnd(aux);
                    
                    lista.display();
                    break;
                    
                case 2:
                    System.out.println("Digite o codigo dvd que deseja verificar");
                    int code = in.nextInt();
                    lista.disponibilidade(code);                   
                    break;
                    
                case 3:
                    System.out.println("Digite o nome do filme que deseja alugar: ");
                    nome = in.next();
                    lista.alugar(nome);

                    break;
                case 4:
                    System.out.println("Digite o nome do filme para devolução");
                    nome = in.next();

                    lista.devolver(nome);

                    break;
                case 5:
                    System.out.println("Digite o codigo do Dvd que será vendido: ");
                    codigo = in.nextInt();
                    lista.vender(codigo);
                    break;

                case 6:
                    System.out.println("Fechando o programa:");
                    break;

            }


        } while ((resp >= 1)&& (resp < 6));
        
        
        DVD dvd2 = new DVD(4, "aa", 0, "bb");
        DVD dvd1 = new DVD(1, "bb", 0, "bb");
        Node n = new Node(dvd2);
        lista.addEnd(n);
        Node a = new Node(dvd1);
        lista.addEnd(a);
        lista.disponibilidade(4);        
        lista.disponibilidade(1);
        lista.disponibilidade(0);
        lista.disponibilidade(3);
        lista.disponibilidade(4);
        lista.disponibilidade(1);
        lista.display();
        
    }    
}
