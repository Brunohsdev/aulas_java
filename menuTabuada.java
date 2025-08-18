import java.util.Scanner;

public class menuTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Calcular Tabuada");
            System.out.println("2 - Realizar Contagem Regressiva");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número para calcular a tabuada: ");
                    int num = scanner.nextInt();
                    System.out.println("Tabuada do " + num + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(num + " x " + i + " = " + (num * i));
                    }
                    break;

                case 2:
                    System.out.print("Digite o número para começar a contagem regressiva: ");
                    int inicio = scanner.nextInt();
                    System.out.println("Contagem regressiva:");
                    for (int i = inicio; i >= 0; i--) {
                        System.out.println(i);
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
        }
    }

