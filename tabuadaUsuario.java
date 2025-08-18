import java.util.Scanner;

public class tabuadaUsuario {
      
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int multiplicador = 0;
        int total = 0;  
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            total = numero * ++multiplicador;
            System.out.println(numero + " * " + i + "= " + total);
        }
    }
}
