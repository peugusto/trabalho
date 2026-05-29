package application;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import controller.AlunoController;
import controller.DisciplinaController;
import controller.MatriculaController;
import controller.NotaController;
import controller.ProfessorController;
import controller.ProvaController;
import controller.TurmaController;
import model.Aluno;
import model.Cursa;
import model.Prova;
import model.Realiza;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    private static AlunoController alunoController = new AlunoController();
    private static ProfessorController professorController = new ProfessorController();
    private static DisciplinaController disciplinaController = new DisciplinaController();
    private static TurmaController turmaController = new TurmaController();
    private static MatriculaController matriculaController = new MatriculaController();
    private static ProvaController provaController = new ProvaController();
    private static NotaController notaController = new NotaController();

    public static void main(String[] args) {

        carregarDadosIniciais();

        int opcao;

        do {

            System.out.println("\n========== SISTEMA ACADÊMICO ==========");
            System.out.println("1 - Gerenciar Alunos");
            System.out.println("2 - Gerenciar Professores");
            System.out.println("3 - Gerenciar Disciplinas");
            System.out.println("4 - Gerenciar Turmas");
            System.out.println("5 - Gerenciar Matrículas");
            System.out.println("6 - Gerenciar Provas");
            System.out.println("7 - Gerenciar Notas");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                case 1:
                    menuAluno();
                    break;

                case 2:
                    menuProfessor();
                    break;

                case 3:
                    menuDisciplina();
                    break;

                case 4:
                    menuTurma();
                    break;

                case 5:
                    menuMatricula();
                    break;

                case 6:
                    menuProva();
                    break;

                case 7:
                    menuNota();
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    // ========================= ALUNOS =========================

    private static void menuAluno() {

        int opcao;

        do {

            System.out.println("\n----- MENU ALUNOS -----");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("0 - Voltar");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                case 1:

                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();

                    System.out.print("Ano nascimento: ");
                    int ano = Integer.parseInt(sc.nextLine());

                    System.out.print("Mês nascimento: ");
                    int mes = Integer.parseInt(sc.nextLine());

                    System.out.print("Dia nascimento: ");
                    int dia = Integer.parseInt(sc.nextLine());

                    System.out.print("Endereço: ");
                    String endereco = sc.nextLine();

                    String resultado = alunoController.cadastrarAluno(
                            matricula,
                            nome,
                            cpf,
                            LocalDate.of(ano, mes, dia),
                            endereco
                    );

                    System.out.println(resultado);

                    break;

                case 2:

                    List<Aluno> alunos = alunoController.listarAlunos();

                    for (Aluno aluno : alunos) {

                        System.out.println("-------------------------");
                        System.out.println("ID: " + aluno.getIdAluno());
                        System.out.println("Nome: " + aluno.getNome());
                        System.out.println("Matrícula: " + aluno.getMatricula());
                        System.out.println("CPF: " + aluno.getCpf());
                    }

                    break;
            }

        } while (opcao != 0);
    }

    // ========================= PROFESSORES =========================

    private static void menuProfessor() {

        int opcao;

        do {

            System.out.println("\n----- MENU PROFESSORES -----");
            System.out.println("1 - Cadastrar professor");
            System.out.println("2 - Listar professores");
            System.out.println("0 - Voltar");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Titulação: ");
                    String titulacao = sc.nextLine();

                    System.out.print("Especialização: ");
                    String especializacao = sc.nextLine();

                    String resultado = professorController.cadastrarProfessor(
                            nome,
                            titulacao,
                            especializacao
                    );

                    System.out.println(resultado);

                    break;

                case 2:

                    professorController.listarProfessores().forEach(professor -> {

                        System.out.println("-------------------------");
                        System.out.println("ID: " + professor.getIdProfessor());
                        System.out.println("Nome: " + professor.getNome());
                        System.out.println("Titulação: " + professor.getTitulacao());
                    });

                    break;
            }

        } while (opcao != 0);
    }

    // ========================= DISCIPLINAS =========================

    private static void menuDisciplina() {

        int opcao;

        do {

            System.out.println("\n----- MENU DISCIPLINAS -----");
            System.out.println("1 - Cadastrar disciplina");
            System.out.println("2 - Listar disciplinas");
            System.out.println("0 - Voltar");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Carga horária: ");
                    Integer carga = Integer.parseInt(sc.nextLine());

                    String resultado = disciplinaController.cadastrarDisciplina(
                            nome,
                            carga
                    );

                    System.out.println(resultado);

                    break;

                case 2:

                    disciplinaController.listarDisciplinas().forEach(disciplina -> {

                        System.out.println("-------------------------");
                        System.out.println("ID: " + disciplina.getIdDisciplina());
                        System.out.println("Nome: " + disciplina.getNome());
                        System.out.println("Carga Horária: " + disciplina.getCargaHoraria());
                    });

                    break;
            }

        } while (opcao != 0);
    }

    // ========================= TURMAS =========================

    private static void menuTurma() {

        int opcao;

        do {

            System.out.println("\n----- MENU TURMAS -----");
            System.out.println("1 - Cadastrar turma");
            System.out.println("2 - Listar turmas");
            System.out.println("0 - Voltar");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                case 1:

                    System.out.print("Turno: ");
                    String turno = sc.nextLine();

                    System.out.print("Dia: ");
                    String dia = sc.nextLine();

                    System.out.print("Horário início: ");
                    String inicio = sc.nextLine();

                    System.out.print("Horário fim: ");
                    String fim = sc.nextLine();

                    System.out.print("ID Disciplina: ");
                    Integer idDisciplina = Integer.parseInt(sc.nextLine());

                    System.out.print("ID Professor: ");
                    Integer idProfessor = Integer.parseInt(sc.nextLine());

                    String resultado = turmaController.cadastrarTurma(
                            turno,
                            dia,
                            inicio,
                            fim,
                            idDisciplina,
                            idProfessor
                    );

                    System.out.println(resultado);

                    break;

                case 2:

                    turmaController.listarTurmas().forEach(turma -> {

                        System.out.println("-------------------------");
                        System.out.println("ID: " + turma.getIdTurma());
                        System.out.println("Disciplina: " + turma.getDisciplina().getNome());
                        System.out.println("Professor: " + turma.getProfessor().getNome());
                        System.out.println("Dia: " + turma.getDia());
                    });

                    break;
            }

        } while (opcao != 0);
    }

    // ========================= MATRÍCULAS =========================

    private static void menuMatricula() {

        int opcao;

        do {

            System.out.println("\n----- MENU MATRÍCULAS -----");
            System.out.println("1 - Matricular aluno");
            System.out.println("2 - Listar matrículas");
            System.out.println("0 - Voltar");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                case 1:

                    System.out.print("ID Aluno: ");
                    Integer idAluno = Integer.parseInt(sc.nextLine());

                    System.out.print("ID Turma: ");
                    Integer idTurma = Integer.parseInt(sc.nextLine());

                    System.out.print("Ano: ");
                    Integer ano = Integer.parseInt(sc.nextLine());

                    System.out.print("Semestre: ");
                    Integer semestre = Integer.parseInt(sc.nextLine());

                    String resultado = matriculaController.matricularAluno(
                            idAluno,
                            idTurma,
                            ano,
                            semestre
                    );

                    System.out.println(resultado);

                    break;

                case 2:

                    List<Cursa> matriculas = matriculaController.listarMatriculas();

                    for (Cursa c : matriculas) {

                        System.out.println("-------------------------");
                        System.out.println("ID Matrícula: " + c.getIdCurso());
                        System.out.println("Aluno: " + c.getAluno().getNome());
                        System.out.println("Turma: " + c.getTurma().getIdTurma());
                    }

                    break;
            }

        } while (opcao != 0);
    }

    // ========================= PROVAS =========================

    private static void menuProva() {

        int opcao;

        do {

            System.out.println("\n----- MENU PROVAS -----");
            System.out.println("1 - Cadastrar prova");
            System.out.println("2 - Listar provas");
            System.out.println("0 - Voltar");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                case 1:

                    System.out.print("Código da prova: ");
                    String codigo = sc.nextLine();

                    System.out.print("Peso: ");
                    BigDecimal peso = new BigDecimal(sc.nextLine());

                    System.out.print("Ano da prova: ");
                    int ano = Integer.parseInt(sc.nextLine());

                    System.out.print("Mês da prova: ");
                    int mes = Integer.parseInt(sc.nextLine());

                    System.out.print("Dia da prova: ");
                    int dia = Integer.parseInt(sc.nextLine());

                    System.out.print("ID Turma: ");
                    Integer idTurma = Integer.parseInt(sc.nextLine());

                    String resultado = provaController.cadastrarProva(
                            LocalDate.of(ano, mes, dia),
                            codigo,
                            peso,
                            idTurma
                    );

                    System.out.println(resultado);

                    break;

                case 2:

                    List<Prova> provas = provaController.listarProvas();

                    for (Prova prova : provas) {

                        System.out.println("-------------------------");
                        System.out.println("ID: " + prova.getIdProva());
                        System.out.println("Código: " + prova.getCodigo());
                        System.out.println("Peso: " + prova.getPeso());
                        System.out.println("Turma: " + prova.getTurma().getIdTurma());
                    }

                    break;
            }

        } while (opcao != 0);
    }

    // ========================= NOTAS =========================

    private static void menuNota() {

        int opcao;

        do {

            System.out.println("\n----- MENU NOTAS -----");
            System.out.println("1 - Lançar nota");
            System.out.println("2 - Listar notas aluno");
            System.out.println("0 - Voltar");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                case 1:

                    System.out.print("ID Aluno: ");
                    Integer idAluno = Integer.parseInt(sc.nextLine());

                    System.out.print("ID Prova: ");
                    Integer idProva = Integer.parseInt(sc.nextLine());

                    System.out.print("Nota: ");
                    BigDecimal nota = new BigDecimal(sc.nextLine());

                    String resultado = notaController.lancarNota(
                            idAluno,
                            idProva,
                            nota
                    );

                    System.out.println(resultado);

                    break;

                case 2:

                    System.out.print("ID Aluno: ");
                    Integer alunoId = Integer.parseInt(sc.nextLine());

                    List<Realiza> notas =
                            notaController.listarNotasAluno(alunoId);

                    for (Realiza r : notas) {

                        System.out.println("-------------------------");
                        System.out.println("Aluno: " + r.getAluno().getNome());
                        System.out.println("Prova: " + r.getProva().getCodigo());
                        System.out.println("Nota: " + r.getNota());
                    }

                    break;
            }

        } while (opcao != 0);
    }

    // ========================= DADOS INICIAIS =========================

    private static void carregarDadosIniciais() {

        professorController.cadastrarProfessor(
                "Carlos Silva",
                "Mestre",
                "Banco de Dados"
        );

        professorController.cadastrarProfessor(
                "Ana Souza",
                "Doutora",
                "Engenharia de Software"
        );

        disciplinaController.cadastrarDisciplina(
                "POO",
                80
        );

        disciplinaController.cadastrarDisciplina(
                "Banco de Dados",
                60
        );

        alunoController.cadastrarAluno(
                "2024001",
                "João Pedro",
                "11111111111",
                LocalDate.of(2002, 5, 10),
                "Rua A"
        );

        alunoController.cadastrarAluno(
                "2024002",
                "Maria Clara",
                "22222222222",
                LocalDate.of(2001, 3, 15),
                "Rua B"
        );
    }
}