import java.util.Scanner;

public class propfessorsenai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String professor;

        do {
            System.out.println("Digite qual é o professor mais fofo do SENAI pra você: ");
            professor = sc.next();
        } while (!professor.equalsIgnoreCase("Anderson"));

        sc.close();
    }
}
