package model;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private Integer idTurma;
    private String turno;
    private String dia;
    private String horarioInicio;
    private String horarioFim;

    private Disciplina disciplina;
    private Professor professor;

    private List<Cursa> matriculas = new ArrayList<>();
    private List<Prova> provas = new ArrayList<>();

    public Turma(Integer idTurma,
                 String turno,
                 String dia,
                 String horarioInicio,
                 String horarioFim,
                 Disciplina disciplina,
                 Professor professor) {

        this.idTurma = idTurma;
        this.turno = turno;
        this.dia = dia;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public Integer getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(Integer idTurma) {
        this.idTurma = idTurma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(String horarioFim) {
        this.horarioFim = horarioFim;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Cursa> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Cursa> matriculas) {
        this.matriculas = matriculas;
    }

    public void addMatricula(Cursa cursa) {
        this.matriculas.add(cursa);
    }

    public void removeMatricula(Cursa cursa) {
        this.matriculas.remove(cursa);
    }

    public List<Prova> getProvas() {
        return provas;
    }

    public void setProvas(List<Prova> provas) {
        this.provas = provas;
    }

    public void addProva(Prova prova) {
        this.provas.add(prova);
    }

    public void removeProva(Prova prova) {
        this.provas.remove(prova);
    }
}