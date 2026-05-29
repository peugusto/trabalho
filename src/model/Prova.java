package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Prova {

    private Integer idProva;
    private LocalDate dataProva;
    private String codigo;
    private BigDecimal peso;

    private Turma turma;

    private List<Realiza> realizacoes = new ArrayList<>();

    public Prova(Integer idProva, LocalDate dataProva,
                  String codigo, BigDecimal peso, Turma turma) {

        this.idProva = idProva;
        this.dataProva = dataProva;
        this.codigo = codigo;
        this.peso = peso;
        this.turma = turma;
    }

    public Integer getIdProva() {
        return idProva;
    }

    public void setIdProva(Integer idProva) {
        this.idProva = idProva;
    }

    public LocalDate getDataProva() {
        return dataProva;
    }

    public void setDataProva(LocalDate dataProva) {
        this.dataProva = dataProva;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public List<Realiza> getRealizacoes() {
        return realizacoes;
    }

    public void setRealizacoes(List<Realiza> realizacoes) {
        this.realizacoes = realizacoes;
    }

    public void addRealizacao(Realiza realizacao) {
        this.realizacoes.add(realizacao);
    }

    public void removeRealizacao(Realiza realizacao) {
        this.realizacoes.remove(realizacao);
    }
}