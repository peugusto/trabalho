package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Aluno {

    private Integer idAluno;
    private String matricula;
    private String nome;
    private String cpf;
    private LocalDate dtNascimento;
    private String endereco;

    private List<Cursa> cursos = new ArrayList<>();
    private List<Realiza> realizacoes = new ArrayList<>();

    public Aluno(Integer idAluno, String matricula, String nome,
                  String cpf, LocalDate dtNascimento, String endereco) {

        this.idAluno = idAluno;
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.endereco = endereco;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Cursa> getCursos() {
        return cursos;
    }

    public void setCursos(List<Cursa> cursos) {
        this.cursos = cursos;
    }

    public List<Realiza> getRealizacoes() {
        return realizacoes;
    }

    public void setRealizacoes(List<Realiza> realizacoes) {
        this.realizacoes = realizacoes;
    }

    public void addCurso(Cursa curso) {
        this.cursos.add(curso);
    }

    public void removeCurso(Cursa curso) {
        this.cursos.remove(curso);
    }

    public void addRealizacao(Realiza realizacao) {
        this.realizacoes.add(realizacao);
    }

    public void removeRealizacao(Realiza realizacao) {
        this.realizacoes.remove(realizacao);
    }
}