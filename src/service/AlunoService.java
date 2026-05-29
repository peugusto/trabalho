package service;

import java.time.LocalDate;
import java.util.List;

import database.BancoFake;
import database.IdGenerator;
import model.Aluno;

public class AlunoService {

    public String cadastrarAluno(String matricula,
                                 String nome,
                                 String cpf,
                                 LocalDate dtNascimento,
                                 String endereco) {

        for (Aluno aluno : BancoFake.alunos) {

            if (aluno.getCpf().equals(cpf)) {
                return "CPF já cadastrado.";
            }

            if (aluno.getMatricula().equals(matricula)) {
                return "Matrícula já cadastrada.";
            }
        }

        Aluno aluno = new Aluno(
                IdGenerator.gerarIdAluno(),
                matricula,
                nome,
                cpf,
                dtNascimento,
                endereco
        );

        BancoFake.alunos.add(aluno);

        return "Aluno cadastrado com sucesso.";
    }

    public List<Aluno> listarAlunos() {
        return BancoFake.alunos;
    }

    public Aluno buscarAlunoPorId(Integer idAluno) {

        for (Aluno aluno : BancoFake.alunos) {

            if (aluno.getIdAluno().equals(idAluno)) {
                return aluno;
            }
        }

        return null;
    }

    public Aluno buscarAlunoPorMatricula(String matricula) {

        for (Aluno aluno : BancoFake.alunos) {

            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }

        return null;
    }

    public String removerAluno(Integer idAluno) {

        Aluno aluno = buscarAlunoPorId(idAluno);

        if (aluno == null) {
            return "Aluno não encontrado.";
        }

        BancoFake.alunos.remove(aluno);

        return "Aluno removido com sucesso.";
    }
}