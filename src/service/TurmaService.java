package service;

import java.util.List;

import database.BancoFake;
import database.IdGenerator;
import model.Disciplina;
import model.Professor;
import model.Turma;

public class TurmaService {

    private DisciplinaService disciplinaService = new DisciplinaService();
    private ProfessorService professorService = new ProfessorService();

    public String cadastrarTurma(String turno,
                                 String dia,
                                 String horarioInicio,
                                 String horarioFim,
                                 Integer idDisciplina,
                                 Integer idProfessor) {

        Disciplina disciplina = disciplinaService.buscarDisciplinaPorId(idDisciplina);

        if (disciplina == null) {
            return "Disciplina não encontrada.";
        }

        Professor professor = professorService.buscarProfessorPorId(idProfessor);

        if (professor == null) {
            return "Professor não encontrado.";
        }

        Turma turma = new Turma(
                IdGenerator.gerarIdTurma(),
                turno,
                dia,
                horarioInicio,
                horarioFim,
                disciplina,
                professor
        );

        BancoFake.turmas.add(turma);

        disciplina.addTurma(turma);

        professor.addTurma(turma);

        return "Turma cadastrada com sucesso.";
    }

    public List<Turma> listarTurmas() {
        return BancoFake.turmas;
    }

    public Turma buscarTurmaPorId(Integer idTurma) {

        for (Turma turma : BancoFake.turmas) {

            if (turma.getIdTurma().equals(idTurma)) {
                return turma;
            }
        }

        return null;
    }

    public String removerTurma(Integer idTurma) {

        Turma turma = buscarTurmaPorId(idTurma);

        if (turma == null) {
            return "Turma não encontrada.";
        }

        BancoFake.turmas.remove(turma);

        return "Turma removida com sucesso.";
    }
}