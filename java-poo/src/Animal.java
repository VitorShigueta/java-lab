public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void rugir() {
        System.out.println("Roar Roar");
    };
}
