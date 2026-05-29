package service;

import java.util.List;

import database.BancoFake;
import database.IdGenerator;
import model.Professor;

public class ProfessorService {

    public String cadastrarProfessor(String nome,
                                     String titulacao,
                                     String especializacao) {

        Professor professor = new Professor(
                IdGenerator.gerarIdProfessor(),
                nome,
                titulacao,
                especializacao
        );

        BancoFake.professores.add(professor);

        return "Professor cadastrado com sucesso.";
    }

    public List<Professor> listarProfessores() {
        return BancoFake.professores;
    }

    public Professor buscarProfessorPorId(Integer idProfessor) {

        for (Professor professor : BancoFake.professores) {

            if (professor.getIdProfessor().equals(idProfessor)) {
                return professor;
            }
        }

        return null;
    }

    public String removerProfessor(Integer idProfessor) {

        Professor professor = buscarProfessorPorId(idProfessor);

        if (professor == null) {
            return "Professor não encontrado.";
        }

        BancoFake.professores.remove(professor);

        return "Professor removido com sucesso.";
    }
}