package model;

public class Boneco {
     static String vestimenta = "roupa básica";
     String corDeCabelo;
     String nome;

    public Boneco(String nomeBoneco, String corDeCabeloBoneco) {
        this.corDeCabelo = corDeCabeloBoneco;
        this.nome = nomeBoneco;
    }

    public void falar() {
        System.out.printf("Olá, sou um(a) Boneco. Meu nome é %s.%n", nome);
    }

    // Getters e Setters
    public static String getVestimenta() {
        return vestimenta;
    }

    public static void setVestimenta(String novaVestimenta) {
        vestimenta = novaVestimenta;
    }

    public String getCorDeCabelo() {
        return corDeCabelo;
    }

    public void setCorDeCabelo(String corDeCabelo) {
        this.corDeCabelo = corDeCabelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
