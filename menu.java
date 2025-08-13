import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int op=0;
        while(op !=5){
        System.out.println("====MENU====");
        System.out.println("1-CADASTRAR");
        System.out.println("2-LISTAR");
        System.out.println("3-ALTERAR");
        System.out.println("4-REMOVER");
        System.out.println("5-SAIR");
        System.out.println("ESCOLHA A OPÇÃO");
        
        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Cadastrar");
                break;
            case 2:
                System.out.println("Listar");
                break;
            case 3:
                System.out.println("Alternar");
                break;
            case 4:
                System.out.println("Remover");
                break;
            case 5:
                System.out.println("Adeus");
                break;
            
        
            default:
                System.out.println("Opção inválida!");
                break;
        }
        }

        sc.close();
    }
}
