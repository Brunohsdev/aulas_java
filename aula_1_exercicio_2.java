//crie um algoritmo com 3 variuaveis e atrtibua valores a elas
public class teste {
    public static void main(String[] args) {
        String nome = "bruno";
        int idade = 18;
        char sexo = 'M';

        System.out.println();
        String mensagem = String.format("Olá %s sua idade é de %d e seu sexo é %c", nome, idade,  sexo);
        System.out.println(mensagem);
    }
    
}