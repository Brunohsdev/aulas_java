import java.util.Scanner;

public class validacaoDeEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        do{
        System.out.print("Digite um número positivo (maior que 0):");
        numero = scanner.nextInt();
        if(numero <=0){
            System.out.println("Entrada inválida. Tente novamente.");
        }
    }
    while(numero <=0);
    System.out.println("Ótimo! você digitou o número positivo: " + numero);
    scanner.close();
    }
}
