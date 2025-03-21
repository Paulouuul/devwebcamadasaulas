package model;

import java.util.List;
import java.time.LocalTime;
import java.time.DayOfWeek;

public class Turma {

    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos;
    private String codigo;
    private String semestre;
    private DayOfWeek dia;
    private LocalTime horario;
    private String sala;

    public Turma(Professor professor, Disciplina disciplina, List<Aluno> alunos, String codigo, String semestre,
                 DayOfWeek dia, LocalTime horario, String sala) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = alunos;
        this.codigo = codigo;
        this.semestre = semestre;
        this.dia = dia;
        this.horario = horario;
        this.sala = sala;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public DayOfWeek getDia() {
        return dia;
    }

    public void setDia(DayOfWeek dia) {
        this.dia = dia;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }


    public void addTurma(Aluno aluno) {
        if (alunos != null && !this.alunos.contains(aluno)) {
            this.alunos.add(aluno);
        }
    }

    public void removeTurma(Aluno aluno) {
        if (alunos != null) {
            this.alunos.remove(aluno);
        }
    }


    public void exibirInformacoes() {
        System.out.println("### Informações da Turma: " + codigo + " ###");
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
        System.out.println("Dia: " + dia);
        System.out.println("Horário: " + horario);
        System.out.println("Sala: " + sala);
        System.out.println("Disciplina: " + (disciplina != null ? disciplina.getNome() : "Não atribuída"));
        System.out.println("Professor: " + (professor != null ? professor.getNome() : "Não atribuído"));
        System.out.println("Alunos:");

        if (alunos != null && !alunos.isEmpty()) {
            for (Aluno aluno : alunos) {
                System.out.println(" - " + aluno.getNome());
            }
        } else {
            System.out.println("Nenhum aluno na turma.");
        }
    }



}
