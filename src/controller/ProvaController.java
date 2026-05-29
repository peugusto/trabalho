package controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import model.Prova;
import service.ProvaService;

public class ProvaController {

    private ProvaService provaService = new ProvaService();

    public String cadastrarProva(LocalDate dataProva,
                                 String codigo,
                                 BigDecimal peso,
                                 Integer idTurma) {

        return provaService.cadastrarProva(
                dataProva,
                codigo,
                peso,
                idTurma
        );
    }

    public List<Prova> listarProvas() {
        return provaService.listarProvas();
    }

    public List<Prova> listarProvasPorTurma(Integer idTurma) {
        return provaService.listarProvasPorTurma(idTurma);
    }

    public Prova buscarProvaPorId(Integer idProva) {
        return provaService.buscarProvaPorId(idProva);
    }

    public String removerProva(Integer idProva) {
        return provaService.removerProva(idProva);
    }
}