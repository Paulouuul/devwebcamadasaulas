package control;
// import model;
import model.Carro;
import model.Moto;

public class Programa {

    public static void main(String[] args){
        Carro carro = new Carro();
        Moto moto = new Moto();

        System.out.println(carro.acelerar());
        System.out.println(carro.frear());
        System.out.println("");
        System.out.println(moto.acelerar());
        System.out.println(moto.frear());

    }
}
