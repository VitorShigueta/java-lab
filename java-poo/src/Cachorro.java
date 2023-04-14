public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void rugir() {
        System.out.println("Au Au");;
    }
}
