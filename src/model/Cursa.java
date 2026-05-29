package model;

public class Cursa {

    private Integer idCurso;
    private Aluno aluno;
    private Turma turma;
    private Integer ano;
    private Integer semestre;

    public Cursa(Integer idCurso, Aluno aluno, Turma turma,
                  Integer ano, Integer semestre) {

        this.idCurso = idCurso;
        this.aluno = aluno;
        this.turma = turma;
        this.ano = ano;
        this.semestre = semestre;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }
}