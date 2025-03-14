package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

    private List<Turma> turmas;
    private int nota_enem;
    private float percent_bolsa;

    // Construtor
    public Aluno(String matricula, String nome, List<Turma> turmas, int nota_enem, float percent_bolsa) {
        super(matricula, nome);  // Chama o construtor da classe Pessoa
        this.turmas = turmas;
        this.nota_enem = nota_enem;
        this.percent_bolsa = percent_bolsa;
    }

    // Getters e Setters
    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public int getNota_enem() {
        return nota_enem;
    }

    public void setNota_enem(int nota_enem) {
        this.nota_enem = nota_enem;
    }

    public float getPercent_bolsa() {
        return percent_bolsa;
    }

    public void setPercent_bolsa(float percent_bolsa) {
        this.percent_bolsa = percent_bolsa;
    }

    public void addTurma(Turma turma) {
        if (turma != null && !this.turmas.contains(turma)) {
            this.turmas.add(turma);
        }
    }

    public void removeTurma(Turma turma) {
        if (turma != null) {
            this.turmas.remove(turma);
        }
    }


    // Método para exibir as informações do Aluno
    public void exibirInformacoes() {
        System.out.println("### Informações do Aluno: " + this.getNome() + " ###");
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nota ENEM: " + this.nota_enem);
        System.out.println("Percentual de Bolsa: " + this.percent_bolsa + "%");

        System.out.println("Turmas: ");
        if (turmas != null && !turmas.isEmpty()) {
            for (Turma turma : turmas) {
                System.out.println("- " + turma.getCodigo() + " (" + turma.getDisciplina().getNome() + ")");
            }
        } else {
            System.out.println("Nenhuma turma associada.");
        }
        System.out.println("------------------------------------------------");
    }
}
