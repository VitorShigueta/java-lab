public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void rugir() {
        System.out.println("Miau Miau");
    }

}
