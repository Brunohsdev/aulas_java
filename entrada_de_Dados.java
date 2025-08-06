
import java.util.Scanner;

public class entrada_de_Dados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu n1: ");
        int n1 = sc.nextInt();
        
       

        System.out.println("Digite sua n2: ");
        int n2 = sc.nextInt();
        int soma = n1 + n2;
        String mensagem = String.format("A soma de %d mais %d é igual a : ", n1, n2);
       System.out.println(mensagem + soma);
        //código
        sc.close();
    }
}
