package model;

import java.time.Duration;
import java.util.List;

public class Disciplina {

    private String codigo;
    private String nome;
    private Duration carga_horaria;
    private List<Turma> turmas;

    public Duration getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(Duration carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    // Construtor

    // Construtor com carga_horaria
    public Disciplina(String codigo, String nome, Duration carga_horaria, List<Turma> turmas) {
        this.codigo = codigo;
        this.nome = nome;
        this.carga_horaria = carga_horaria;
        this.turmas = turmas;
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public void exibirInformacoes() {
        System.out.println("### Informações da Disciplina: " + nome + " ###");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Carga Horária: " + carga_horaria.toHours() + " horas");

        if (turmas != null && !turmas.isEmpty()) {
            System.out.println("Turmas:");
            for (Turma turma : turmas) {
                System.out.println(" - " + turma.getCodigo() + " (Professor: " + turma.getProfessor().getNome() + ")");
            }
        } else {
            System.out.println("Nenhuma turma associada a esta disciplina.");
        }
    }
}
