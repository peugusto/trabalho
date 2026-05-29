package controller;


import java.util.List;

import model.Turma;
import service.TurmaService;

public class TurmaController {

    private TurmaService turmaService = new TurmaService();

    public String cadastrarTurma(String turno,
                                 String dia,
                                 String horarioInicio,
                                 String horarioFim,
                                 Integer idDisciplina,
                                 Integer idProfessor) {

        return turmaService.cadastrarTurma(
                turno,
                dia,
                horarioInicio,
                horarioFim,
                idDisciplina,
                idProfessor
        );
    }

    public List<Turma> listarTurmas() {
        return turmaService.listarTurmas();
    }

    public Turma buscarTurmaPorId(Integer idTurma) {
        return turmaService.buscarTurmaPorId(idTurma);
    }

    public String removerTurma(Integer idTurma) {
        return turmaService.removerTurma(idTurma);
    }
}