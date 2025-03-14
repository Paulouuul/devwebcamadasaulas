package control;

import model.Aluno;
import model.Disciplina;
import model.Professor;
import model.Turma;

import java.time.Duration;
import java.time.LocalTime;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        List<Turma> turmas = new ArrayList<>();
        List<Disciplina> disciplinas = new ArrayList<>();

        // Cadastro de múltiplos alunos
        System.out.print("Quantos alunos deseja cadastrar? ");
        int qtdAlunos = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < qtdAlunos; i++) {
            alunos.add(cadastrarAluno());
        }

        // Cadastro de múltiplos professores
        System.out.print("Quantos professores deseja cadastrar? ");
        int qtdProfessores = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < qtdProfessores; i++) {
            professores.add(cadastrarProfessor());
        }

        // Cadastro de múltiplas disciplinas
        System.out.print("Quantas disciplinas deseja cadastrar? ");
        int qtdDisciplinas = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < qtdDisciplinas; i++) {
            disciplinas.add(cadastrarDisciplina());
        }

        // Cadastro de múltiplas turmas associadas corretamente
        System.out.print("Quantas turmas deseja cadastrar? ");
        int qtdTurmas = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < qtdTurmas; i++) {
            turmas.add(cadastrarTurma(professores, disciplinas, alunos));
        }

        // Exibir todas as informações
        System.out.println("\n### Exibindo todas as informações ###\n");
        alunos.forEach(Aluno::exibirInformacoes);
        professores.forEach(Professor::exibirInformacoes);
        disciplinas.forEach(Disciplina::exibirInformacoes);
        turmas.forEach(Turma::exibirInformacoes);
    }

    public static Aluno cadastrarAluno() {
        System.out.println("\nDigite as informações do Aluno:");
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Nota do ENEM: ");
        int notaEnem = Integer.parseInt(scanner.nextLine());
        System.out.print("Percentual de Bolsa: ");
        float percentualBolsa = Float.parseFloat(scanner.nextLine());
        return new Aluno(matricula, nome, new ArrayList<>(), notaEnem, percentualBolsa);
    }

    public static Professor cadastrarProfessor() {
        System.out.println("\nDigite as informações do Professor:");
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Titulação: ");
        String titulacao = scanner.nextLine();
        System.out.print("Carga Horária (em horas): ");
        Duration cargaHoraria = Duration.ofHours(Long.parseLong(scanner.nextLine()));
        return new Professor(matricula, nome, new ArrayList<>(), titulacao, cargaHoraria);
    }

    public static Disciplina cadastrarDisciplina() {
        System.out.println("\nDigite as informações da Disciplina:");
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Carga Horária (em horas): ");
        Duration cargaHoraria = Duration.ofHours(Long.parseLong(scanner.nextLine()));
        return new Disciplina(codigo, nome, cargaHoraria, new ArrayList<>());
    }

    public static Turma cadastrarTurma(List<Professor> professores, List<Disciplina> disciplinas, List<Aluno> alunos) {
        System.out.println("\nDigite as informações da Turma:");
        System.out.print("Código da Turma: ");
        String codigo = scanner.nextLine();
        System.out.print("Semestre: ");
        String semestre = scanner.nextLine();
        System.out.print("Dia da semana (ex: MONDAY): ");
        DayOfWeek dia = DayOfWeek.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Horário (ex: 08:30): ");
        LocalTime horario = LocalTime.parse(scanner.nextLine());
        System.out.print("Sala: ");
        String sala = scanner.nextLine();

        System.out.println("\nEscolha um Professor para a Turma:");
        for (int i = 0; i < professores.size(); i++) {
            System.out.println((i + 1) + " - " + professores.get(i).getNome());
        }
        Professor professor = professores.get(Integer.parseInt(scanner.nextLine()) - 1);

        System.out.println("\nEscolha uma Disciplina para a Turma:");
        for (int i = 0; i < disciplinas.size(); i++) {
            System.out.println((i + 1) + " - " + disciplinas.get(i).getNome());
        }
        Disciplina disciplina = disciplinas.get(Integer.parseInt(scanner.nextLine()) - 1);

        List<Aluno> alunosTurma = new ArrayList<>();
        System.out.println("\nQuantos alunos deseja adicionar nesta turma?");
        int qtdAlunosTurma = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < qtdAlunosTurma; i++) {
            System.out.println("Escolha um Aluno:");
            for (int j = 0; j < alunos.size(); j++) {
                System.out.println((j + 1) + " - " + alunos.get(j).getNome());
            }
            alunosTurma.add(alunos.get(Integer.parseInt(scanner.nextLine()) - 1));
        }

        Turma turma = new Turma(professor, disciplina, alunosTurma, codigo, semestre, dia, horario, sala);
        professor.getTurmas().add(turma);
        disciplina.getTurmas().add(turma);
        for (Aluno aluno : alunosTurma) {
            aluno.getTurmas().add(turma);
        }
        return turma;
    }
}
