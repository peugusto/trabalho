package controller;

import java.time.LocalDate;
import java.util.List;

import model.Aluno;
import service.AlunoService;

public class AlunoController {

    private AlunoService alunoService = new AlunoService();

    public String cadastrarAluno(String matricula,
                                 String nome,
                                 String cpf,
                                 LocalDate dtNascimento,
                                 String endereco) {

        return alunoService.cadastrarAluno(
                matricula,
                nome,
                cpf,
                dtNascimento,
                endereco
        );
    }

    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }

    public Aluno buscarAlunoPorId(Integer idAluno) {
        return alunoService.buscarAlunoPorId(idAluno);
    }

    public Aluno buscarAlunoPorMatricula(String matricula) {
        return alunoService.buscarAlunoPorMatricula(matricula);
    }

    public String removerAluno(Integer idAluno) {
        return alunoService.removerAluno(idAluno);
    }
}