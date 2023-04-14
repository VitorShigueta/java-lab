public class Main {

    public static void main(String[] args){

        Animal cachorro = new Cachorro("Doguinho");
        Animal gato = new Gato("Kitty");

        System.out.println(cachorro.getNome());
        cachorro.rugir();
        System.out.println(gato.getNome());
        gato.rugir();
    }

}
