package model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private Integer idDisciplina;
    private String nome;
    private Integer cargaHoraria;

    private List<Turma> turmas = new ArrayList<>();

    public Disciplina(Integer idDisciplina, String nome, Integer cargaHoraria) {

        this.idDisciplina = idDisciplina;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Integer idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public void addTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public void removeTurma(Turma turma) {
        this.turmas.remove(turma);
    }
}