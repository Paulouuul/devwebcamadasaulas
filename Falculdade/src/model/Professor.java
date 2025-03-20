package model;

import java.util.List;
import java.time.Duration;

public class Professor extends Pessoa {

    private List<Turma> turmas;
    private String titulacao;
    private Duration carga_horaria;

    // Construtor
    public Professor(String matricula, String nome, List<Turma> turmas, String titulacao, Duration carga_horaria) {
        super(matricula, nome);  // Chama o construtor da classe Pessoa
        this.turmas = turmas;
        this.titulacao = titulacao;
        this.carga_horaria = carga_horaria;
    }

    // Getters e Setters
    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Duration getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(Duration carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public void addTurma(Turma turma){
        if (turma != null && !this.turmas.contains(turma)) {
            this.turmas.add(turma);
        }
    }

    public void removeTurma(Turma turma) {
        if (turma != null) {
            this.turmas.remove(turma);
        }
    }

    // Método para exibir as informações do professor
    public void exibirInformacoes() {
        System.out.println("### Informações do Professor: " + getNome() + " ###");
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.println("Titulação: " + titulacao);
        System.out.println("Carga Horária: " + carga_horaria.toHours() + " horas");

        if (turmas != null && !turmas.isEmpty()) {
            System.out.println("Turmas:");
            for (Turma turma : turmas) {
                System.out.println(" - " + turma.getCodigo() + " (" + turma.getDisciplina().getNome() + ")");
            }
        } else {
            System.out.println("O professor não está associado a nenhuma turma.");
        }
    }
}
