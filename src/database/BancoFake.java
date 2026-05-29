package database;

import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import model.Cursa;
import model.Disciplina;
import model.Professor;
import model.Prova;
import model.Realiza;
import model.Turma;

public class BancoFake {

    public static List<Aluno> alunos = new ArrayList<>();

    public static List<Professor> professores = new ArrayList<>();

    public static List<Disciplina> disciplinas = new ArrayList<>();

    public static List<Turma> turmas = new ArrayList<>();

    public static List<Cursa> matriculas = new ArrayList<>();

    public static List<Prova> provas = new ArrayList<>();

    public static List<Realiza> realizacoes = new ArrayList<>();
}