package control;

import model.Barbie;
import model.Ken;

public class Programa {

    public static void main(String[] args) {
        Barbie barbie = new Barbie("Barbie", "loiro");
        Ken ken = new Ken("Ken", "castanho");
        Ken kenfalso = new Ken("Ken Falso", "ruivo");
        barbie.falar();
        ken.falar();
        kenfalso.falar();
    }

}
