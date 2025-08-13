import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        
        
        try{
            Scanner sc = new Scanner(System.in);
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
            sc.close();
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Digite um numero dentro de sua quantidade");
        }

        catch(InputMismatchException e ){
            System.out.println(("Não pode digitar sinais"));
        }
        
        finally{
            System.out.println("Bloco de codigo");
        }
        
       
    }
}
