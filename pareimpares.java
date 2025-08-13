public class pareimpares {
    public static void main(String[] args) {
        
        
        int numero = 0 ;
        String mensagem = "O número ";
        while(numero <=100){
            if(numero <=50 & numero%2 ==0){
                System.out.println(mensagem+numero+ " é par .");
            }
            else if(numero >= 51 & numero%2 ==1){
                System.out.println(mensagem+numero +" é ímpar.");
            }
            numero++;
        }


    }
}
