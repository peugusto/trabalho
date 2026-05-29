package service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import database.BancoFake;
import database.IdGenerator;
import model.Aluno;
import model.Cursa;
import model.Prova;
import model.Realiza;

public class NotaService {

    private AlunoService alunoService = new AlunoService();
    private ProvaService provaService = new ProvaService();

    public String lancarNota(Integer idAluno,
                             Integer idProva,
                             BigDecimal nota) {

        Aluno aluno = alunoService.buscarAlunoPorId(idAluno);

        if (aluno == null) {
            return "Aluno não encontrado.";
        }

        Prova prova = provaService.buscarProvaPorId(idProva);

        if (prova == null) {
            return "Prova não encontrada.";
        }

        if (nota.compareTo(BigDecimal.ZERO) < 0 ||
            nota.compareTo(new BigDecimal("10")) > 0) {

            return "Nota inválida.";
        }

        boolean matriculado = false;

        for (Cursa cursa : BancoFake.matriculas) {

            boolean mesmoAluno =
                    cursa.getAluno().getIdAluno().equals(idAluno);

            boolean mesmaTurma =
                    cursa.getTurma().getIdTurma()
                            .equals(prova.getTurma().getIdTurma());

            if (mesmoAluno && mesmaTurma) {
                matriculado = true;
                break;
            }
        }

        if (!matriculado) {
            return "Aluno não está matriculado na turma da prova.";
        }

        for (Realiza realiza : BancoFake.realizacoes) {

            boolean mesmoAluno =
                    realiza.getAluno().getIdAluno().equals(idAluno);

            boolean mesmaProva =
                    realiza.getProva().getIdProva().equals(idProva);

            if (mesmoAluno && mesmaProva) {
                return "Nota já lançada para este aluno nesta prova.";
            }
        }

        Realiza realizacao = new Realiza(
                IdGenerator.gerarIdRealizacao(),
                aluno,
                prova,
                nota
        );

        BancoFake.realizacoes.add(realizacao);

        aluno.addRealizacao(realizacao);

        prova.addRealizacao(realizacao);

        return "Nota lançada com sucesso.";
    }

    public List<Realiza> listarNotasAluno(Integer idAluno) {

        List<Realiza> resultado = new ArrayList<>();

        for (Realiza realiza : BancoFake.realizacoes) {

            if (realiza.getAluno().getIdAluno().equals(idAluno)) {
                resultado.add(realiza);
            }
        }

        return resultado;
    }

    public List<Realiza> listarNotasProva(Integer idProva) {

        List<Realiza> resultado = new ArrayList<>();

        for (Realiza realiza : BancoFake.realizacoes) {

            if (realiza.getProva().getIdProva().equals(idProva)) {
                resultado.add(realiza);
            }
        }

        return resultado;
    }

    public Realiza buscarNota(Integer idAluno,
                              Integer idProva) {

        for (Realiza realiza : BancoFake.realizacoes) {

            boolean mesmoAluno =
                    realiza.getAluno().getIdAluno().equals(idAluno);

            boolean mesmaProva =
                    realiza.getProva().getIdProva().equals(idProva);

            if (mesmoAluno && mesmaProva) {
                return realiza;
            }
        }

        return null;
    }

    public String removerNota(Integer idRealizacao) {

        Realiza realizacaoEncontrada = null;

        for (Realiza realiza : BancoFake.realizacoes) {

            if (realiza.getIdRealizacao().equals(idRealizacao)) {
                realizacaoEncontrada = realiza;
                break;
            }
        }

        if (realizacaoEncontrada == null) {
            return "Nota não encontrada.";
        }

        BancoFake.realizacoes.remove(realizacaoEncontrada);

        return "Nota removida com sucesso.";
    }
}