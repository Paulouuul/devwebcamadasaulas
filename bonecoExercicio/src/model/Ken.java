package model;

public class Ken extends Boneco{

    public static String vestimenta = "vestido rosa";

    public Ken(String corDeCabeloBoneco, String nomeBoneco) {
        super(corDeCabeloBoneco, nomeBoneco);
    }

    @Override
    public void falar() {
            System.out.printf("Hi, Barbie. Eu sou o %s. A cor do meu cabelo é %s.%n",nome, corDeCabelo);
    }
}
