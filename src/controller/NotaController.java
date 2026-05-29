package controller;

import java.math.BigDecimal;
import java.util.List;

import model.Realiza;
import service.NotaService;

public class NotaController {

    private NotaService notaService = new NotaService();

    public String lancarNota(Integer idAluno,
                             Integer idProva,
                             BigDecimal nota) {

        return notaService.lancarNota(
                idAluno,
                idProva,
                nota
        );
    }

    public List<Realiza> listarNotasAluno(Integer idAluno) {
        return notaService.listarNotasAluno(idAluno);
    }

    public List<Realiza> listarNotasProva(Integer idProva) {
        return notaService.listarNotasProva(idProva);
    }

    public Realiza buscarNota(Integer idAluno,
                              Integer idProva) {

        return notaService.buscarNota(
                idAluno,
                idProva
        );
    }

    public String removerNota(Integer idRealizacao) {
        return notaService.removerNota(idRealizacao);
    }
}