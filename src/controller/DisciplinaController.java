package controller;

import java.util.List;

import model.Disciplina;
import service.DisciplinaService;

public class DisciplinaController {

    private DisciplinaService disciplinaService = new DisciplinaService();

    public String cadastrarDisciplina(String nome,
                                      Integer cargaHoraria) {

        return disciplinaService.cadastrarDisciplina(
                nome,
                cargaHoraria
        );
    }

    public List<Disciplina> listarDisciplinas() {
        return disciplinaService.listarDisciplinas();
    }

    public Disciplina buscarDisciplinaPorId(Integer idDisciplina) {
        return disciplinaService.buscarDisciplinaPorId(idDisciplina);
    }

    public String removerDisciplina(Integer idDisciplina) {
        return disciplinaService.removerDisciplina(idDisciplina);
    }
}