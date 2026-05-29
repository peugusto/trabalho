package model;

import java.util.ArrayList;
import java.util.List;

public class Professor {

    private Integer idProfessor;
    private String nome;
    private String titulacao;
    private String especializacao;

    private List<Turma> turmas = new ArrayList<>();

    public Professor(Integer idProfessor, String nome,
                      String titulacao, String especializacao) {

        this.idProfessor = idProfessor;
        this.nome = nome;
        this.titulacao = titulacao;
        this.especializacao = especializacao;
    }

    public Integer getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Integer idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
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