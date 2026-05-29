package controller;

import java.util.List;

import model.Professor;
import service.ProfessorService;

public class ProfessorController {

    private ProfessorService professorService = new ProfessorService();

    public String cadastrarProfessor(String nome,
                                     String titulacao,
                                     String especializacao) {

        return professorService.cadastrarProfessor(
                nome,
                titulacao,
                especializacao
        );
    }

    public List<Professor> listarProfessores() {
        return professorService.listarProfessores();
    }

    public Professor buscarProfessorPorId(Integer idProfessor) {
        return professorService.buscarProfessorPorId(idProfessor);
    }

    public String removerProfessor(Integer idProfessor) {
        return professorService.removerProfessor(idProfessor);
    }
}