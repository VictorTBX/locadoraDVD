import java.util.Scanner;

public class Main {
    public static void main(String[] args) {       
        
      Scanner in = new Scanner(System.in);
      Scanner in2 = new Scanner(System.in);
        
        int resp, codigo;
        String nome;        
        Lista lista = new Lista();
        do {
            System.out.println("Menu - Locadora Filme Bom:");
            System.out.println("1 - Adicionar dvd");
            System.out.println("2 - Verificar disponibilidade do filme");
            System.out.println("3 - Locação de DVD");
            System.out.println("4 - Devolução de DVD");
            System.out.println("5 - Venda de DVD");
            System.out.println("6 - Mostra o catálogo");
            System.out.println("7 - Sair");

            resp = in.nextInt();
            switch (resp) {
                case 1:
                 
                    
                    System.out.println("Digite o codigo do DVD");
                    codigo = in.nextInt();
                    System.out.println("Digite o titulo do filme: ");
                    String titulo = in2.nextLine();                    
                    System.out.println("Digite o ano do filme: ");
                    int ano = in.nextInt();                    
                    System.out.println("Digite o estilo do filme: ");
                    String estilo = in2.nextLine();                    
                    System.out.println();
                    System.out.println("Cadastrar o filme: " +titulo+ " ? (0 - Sim / 1 - Não)");
                    int resp2;
                    resp2 = in.nextInt();
                    if (resp2 == 0) {
                        System.out.println("");
                        System.out.println("Filme cadastrado com sucesso.");
                        System.out.println("");
                        DVD dvd= new DVD(codigo, titulo, ano, estilo);                    
                        Node aux = new Node(dvd);                                   
                        lista.addEnd(aux);
                    } else {
                        System.out.println("");
                        System.out.println("Filme não cadastrado.");
                        System.out.println("");
                    }
                    
                    break;
                    
                case 2:
                    System.out.println("Digite o codigo dvd que deseja verificar");
                    int code = in.nextInt();
                    lista.disponibilidade(code);                   
                    break;
                    
                case 3:
                    System.out.println("Digite o nome do filme que deseja alugar: ");
                    nome = in2.nextLine();
                    lista.alugar(nome);

                    break;
                case 4:
                    System.out.println("Digite o nome do filme para devolução");
                    nome = in2.nextLine();

                    lista.devolver(nome);

                    break;
                case 5:
                    System.out.println("Digite o codigo do Dvd que será vendido: ");
                    codigo = in.nextInt();
                    lista.vender(codigo);
                    break;

                case 6:
                    lista.display();
                    break;
                    
                case 7:
                    System.out.println("Fechando o programa.");
                    break;
                    
            }
        } while ((resp >= 1)&& (resp < 7));        
    }    
}
