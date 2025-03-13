package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Empregado> empregados = new ArrayList<>();

    public void addEmpregado(Empregado empregado){
        this.empregados.add(empregado);
    }

    public void removeEmpregado(Empregado empregado){
        this.empregados.add(empregado);
    }
}
