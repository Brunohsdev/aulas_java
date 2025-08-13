import java.util.Scanner;

public class menu_embalagens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while(op!= 4){
            System.out.println("====MENU DE EMBALAGENS====");
            System.out.println("1 - CAIXA DE PAPELÃO");
            System.out.println("2 - SACOLA DE PLÁSTICO");
            System.out.println("3 - EMBALAGEM DE VIDRO");
            System.out.println("4 - SAIR");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Caixa de papelão: Ideal para transporte e armazenamento ");
                    break;
                case 2:
                    System.out.println("Sacola plástica: Leve e prática, mas pouco sustentável");
                    break;
                case 3:
                    System.out.println("Embalagem de vidro: Resistente e reutilizável .");
                    break;
                case 4:
                    System.out.println("SAIR");
                    break;
                
        }
    }
}
}
