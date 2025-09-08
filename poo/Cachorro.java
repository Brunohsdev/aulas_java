public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    @Override
    public void exibirInfo() {
        System.out.println("Cachorro: " + getNome() + ", Idade: " + getIdade() + ", Raça: " + raca);
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "raca='" + raca + '\'' +
                '}';
    }
}
