import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> listaAnimais = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== Pet Shop =====");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Atualizar pet por nome");
            System.out.println("4 - Deletar pet por nome");
            System.out.println("5 - Sair do sistema");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Tipo de animal (1-Cachorro, 2-Gato): ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Raça: ");
                        String raca = sc.nextLine();
                        listaAnimais.add(new Cachorro(nome, idade, raca));
                    } else if (tipo == 2) {
                        System.out.print("Cor do pelo: ");
                        String corPelo = sc.nextLine();
                        listaAnimais.add(new Gato(nome, idade, corPelo));
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Lista de Animais ---");
                    for (Animal a : listaAnimais) {
                        a.exibirInfo(); // Polimorfismo aqui
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do animal que deseja atualizar: ");
                    String nomeAtualizar = sc.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < listaAnimais.size(); i++) {
                        Animal a = listaAnimais.get(i);
                        if (a.getNome().equalsIgnoreCase(nomeAtualizar)) {
                            encontrado = true;
                            System.out.print("Novo nome: ");
                            String novoNome = sc.nextLine();
                            System.out.print("Nova idade: ");
                            int novaIdade = sc.nextInt();
                            sc.nextLine();

                            a.setNome(novoNome);
                            a.setIdade(novaIdade);

                            if (a instanceof Cachorro) {
                                System.out.print("Nova raça: ");
                                ((Cachorro) a).setRaca(sc.nextLine());
                            } else if (a instanceof Gato) {
                                System.out.print("Nova cor do pelo: ");
                                ((Gato) a).setCorPelo(sc.nextLine());
                            }

                            System.out.println("Animal atualizado com sucesso!");
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Animal não encontrado.");
                    }

                    break;

                case 4:
                    System.out.print("Digite o nome do animal que deseja remover: ");
                    String nomeRemover = sc.nextLine();
                    Animal remover = null;
                    for (Animal a : listaAnimais) {
                        if (a.getNome().equalsIgnoreCase(nomeRemover)) {
                            remover = a;
                            break;
                        }
                    }
                    if (remover != null) {
                        listaAnimais.remove(remover);
                        System.out.println("Animal removido com sucesso!");
                    } else {
                        System.out.println("Animal não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);

        sc.close();
    }
}
