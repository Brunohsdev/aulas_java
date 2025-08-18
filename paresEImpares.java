public class paresEImpares {
        public static void main(String[] args) {
            
            String mensagem = "O número ";
            for(int numero = 1; numero<=100; numero++){
                if(numero <=51 & numero%2 ==1){
                    System.out.println(mensagem+numero+ " é ímpar.");
                }
                else if(numero >= 52 & numero%2 ==0){
                    System.out.println(mensagem+numero +" é par.");
                }
                
            }
    
    
        }
    }
    

