public class tabuada {
    public static void main(String[] args) {
        
        int multiplicador = 0;
        int total = 0;  
        int numero = 1;

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            total = numero * ++multiplicador;
            System.out.println(numero + " * " + i + "=" + total);
        }
    }
}