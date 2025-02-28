package control;

import model.Cachorro;
import model.Calculadora;

public class TestePolimorfismo {


    public static void main(String[] args){

        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(2L,2L));
        Cachorro cach = new Cachorro();
        cach.fazerSom();
    }
}
