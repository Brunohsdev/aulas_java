public class Gato extends Animal {
    private String corPelo;

    public Gato(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }


    @Override
    public void exibirInfo() {
        System.out.println("Gato: " + getNome() + ", Idade: " + getIdade() + ", Cor do pelo: " + corPelo);
    }
}
