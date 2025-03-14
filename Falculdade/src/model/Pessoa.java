package model;

public abstract class Pessoa {

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    String matricula;
    String nome;

    // Construtor
    public Pessoa(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
