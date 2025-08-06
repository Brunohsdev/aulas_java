
import java.util.Scanner;

public class entrada_de_Dados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        
       

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        String mensagem = String.format("Olá %s sua idade é %d anos.", nome, idade);
       System.out.println(mensagem);
        //código
        sc.close();
    }
}
