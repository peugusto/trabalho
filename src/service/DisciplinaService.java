package service;

import java.util.List;

import database.BancoFake;
import database.IdGenerator;
import model.Disciplina;

public class DisciplinaService {

    public String cadastrarDisciplina(String nome,
                                      Integer cargaHoraria) {

        Disciplina disciplina = new Disciplina(
                IdGenerator.gerarIdDisciplina(),
                nome,
                cargaHoraria
        );

        BancoFake.disciplinas.add(disciplina);

        return "Disciplina cadastrada com sucesso.";
    }

    public List<Disciplina> listarDisciplinas() {
        return BancoFake.disciplinas;
    }

    public Disciplina buscarDisciplinaPorId(Integer idDisciplina) {

        for (Disciplina disciplina : BancoFake.disciplinas) {

            if (disciplina.getIdDisciplina().equals(idDisciplina)) {
                return disciplina;
            }
        }

        return null;
    }

    public String removerDisciplina(Integer idDisciplina) {

        Disciplina disciplina = buscarDisciplinaPorId(idDisciplina);

        if (disciplina == null) {
            return "Disciplina não encontrada.";
        }

        BancoFake.disciplinas.remove(disciplina);

        return "Disciplina removida com sucesso.";
    }
}