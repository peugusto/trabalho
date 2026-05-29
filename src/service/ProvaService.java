package service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import database.BancoFake;
import database.IdGenerator;
import model.Prova;
import model.Turma;

public class ProvaService {

    private TurmaService turmaService = new TurmaService();

    public String cadastrarProva(LocalDate dataProva,
                                 String codigo,
                                 BigDecimal peso,
                                 Integer idTurma) {

        Turma turma = turmaService.buscarTurmaPorId(idTurma);

        if (turma == null) {
            return "Turma não encontrada.";
        }

        if (peso.compareTo(BigDecimal.ZERO) <= 0) {
            return "Peso inválido.";
        }

        Prova prova = new Prova(
                IdGenerator.gerarIdProva(),
                dataProva,
                codigo,
                peso,
                turma
        );

        BancoFake.provas.add(prova);

        turma.addProva(prova);

        return "Prova cadastrada com sucesso.";
    }

    public List<Prova> listarProvas() {
        return BancoFake.provas;
    }

    public List<Prova> listarProvasPorTurma(Integer idTurma) {

        List<Prova> resultado = new ArrayList<>();

        for (Prova prova : BancoFake.provas) {

            if (prova.getTurma().getIdTurma().equals(idTurma)) {
                resultado.add(prova);
            }
        }

        return resultado;
    }

    public Prova buscarProvaPorId(Integer idProva) {

        for (Prova prova : BancoFake.provas) {

            if (prova.getIdProva().equals(idProva)) {
                return prova;
            }
        }

        return null;
    }

    public String removerProva(Integer idProva) {

        Prova prova = buscarProvaPorId(idProva);

        if (prova == null) {
            return "Prova não encontrada.";
        }

        BancoFake.provas.remove(prova);

        return "Prova removida com sucesso.";
    }
}