package model;

import java.math.BigDecimal;

public class Realiza {

    private Integer idRealizacao;

    private Aluno aluno;
    private Prova prova;
    private BigDecimal nota;

    public Realiza(Integer idRealizacao,
                    Aluno aluno,
                    Prova prova,
                    BigDecimal nota) {

        this.idRealizacao = idRealizacao;
        this.aluno = aluno;
        this.prova = prova;
        this.nota = nota;
    }

    public Integer getIdRealizacao() {
        return idRealizacao;
    }

    public void setIdRealizacao(Integer idRealizacao) {
        this.idRealizacao = idRealizacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }

    public BigDecimal getNota() {
        return nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }
}