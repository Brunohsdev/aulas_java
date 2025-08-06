
import java.util.Locale;

public class variaveis_2 {
    public static void main(String[] args) {
        double x = 10.35784;
        System.out.println(x);
    
        //imprimir 2 casas decimais
        System.out.printf("%.2f%n", x);
       //4 casas decimais
        System.out.printf("%.4f%n", x);
     //trasnsferencia de dados
        Locale.setDefault (Locale.US);
        
        System.out.printf("%.4f%n", x);
    }
    
}