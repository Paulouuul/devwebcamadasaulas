package model;

public class Barbie extends Boneco{

    public static String vestimenta = "vestido rosa";

    public Barbie(String corDeCabeloBoneco, String nomeBoneco) {
        super(corDeCabeloBoneco, nomeBoneco);
    }

    @Override
    public void falar() {
        System.out.printf("Olá, sou a Barbie. A cor do meu cabelo é %s.%n", corDeCabelo);
    }
}
