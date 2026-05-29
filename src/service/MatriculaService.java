package service;

import java.util.ArrayList;
import java.util.List;

import database.BancoFake;
import database.IdGenerator;
import model.Aluno;
import model.Cursa;
import model.Turma;

public class MatriculaService {

    private AlunoService alunoService = new AlunoService();
    private TurmaService turmaService = new TurmaService();

    public String matricularAluno(Integer idAluno,
                                  Integer idTurma,
                                  Integer ano,
                                  Integer semestre) {

        Aluno aluno = alunoService.buscarAlunoPorId(idAluno);

        if (aluno == null) {
            return "Aluno não encontrado.";
        }

        Turma turma = turmaService.buscarTurmaPorId(idTurma);

        if (turma == null) {
            return "Turma não encontrada.";
        }

        for (Cursa cursa : BancoFake.matriculas) {

            boolean mesmoAluno =
                    cursa.getAluno().getIdAluno().equals(idAluno);

            boolean mesmaTurma =
                    cursa.getTurma().getIdTurma().equals(idTurma);

            if (mesmoAluno && mesmaTurma) {
                return "Aluno já matriculado nesta turma.";
            }
        }

        Cursa matricula = new Cursa(
                IdGenerator.gerarIdCurso(),
                aluno,
                turma,
                ano,
                semestre
        );

        BancoFake.matriculas.add(matricula);

        aluno.addCurso(matricula);

        turma.addMatricula(matricula);

        return "Matrícula realizada com sucesso.";
    }

    public List<Cursa> listarMatriculas() {
        return BancoFake.matriculas;
    }

    public List<Cursa> listarMatriculasAluno(Integer idAluno) {

        List<Cursa> resultado = new ArrayList<>();

        for (Cursa cursa : BancoFake.matriculas) {

            if (cursa.getAluno().getIdAluno().equals(idAluno)) {
                resultado.add(cursa);
            }
        }

        return resultado;
    }

    public String removerMatricula(Integer idCurso) {

        Cursa matriculaEncontrada = null;

        for (Cursa cursa : BancoFake.matriculas) {

            if (cursa.getIdCurso().equals(idCurso)) {
                matriculaEncontrada = cursa;
                break;
            }
        }

        if (matriculaEncontrada == null) {
            return "Matrícula não encontrada.";
        }

        BancoFake.matriculas.remove(matriculaEncontrada);

        return "Matrícula removida com sucesso.";
    }
}