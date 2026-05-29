package database;

public class IdGenerator {

    private static Integer idAluno = 1;
    private static Integer idProfessor = 1;
    private static Integer idDisciplina = 1;
    private static Integer idTurma = 1;
    private static Integer idCurso = 1;
    private static Integer idProva = 1;
    private static Integer idRealizacao = 1;

    public static Integer gerarIdAluno() {
        return idAluno++;
    }

    public static Integer gerarIdProfessor() {
        return idProfessor++;
    }

    public static Integer gerarIdDisciplina() {
        return idDisciplina++;
    }

    public static Integer gerarIdTurma() {
        return idTurma++;
    }

    public static Integer gerarIdCurso() {
        return idCurso++;
    }

    public static Integer gerarIdProva() {
        return idProva++;
    }

    public static Integer gerarIdRealizacao() {
        return idRealizacao++;
    }
}