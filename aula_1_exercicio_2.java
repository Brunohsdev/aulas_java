//crie um algoritmo com 3 variuaveis e atrtibua valores a elas e imprima
public class aula_1_exercicio_2 {
    public static void main(String[] args) {
        String nome = "bruno";
        int idade = 18;
        char sexo = 'M';
        String  endereco =  "rua do ceú";

        System.out.println();
        String mensagem = String.format("Olá %s sua idade é de %d anos e seu sexo é %c e você mora no %s", nome, idade,  sexo, endereco);
        System.out.println(mensagem);
    }
    
}