package controller;

import java.util.List;

import model.Cursa;
import service.MatriculaService;

public class MatriculaController {

    private MatriculaService matriculaService = new MatriculaService();

    public String matricularAluno(Integer idAluno,
                                  Integer idTurma,
                                  Integer ano,
                                  Integer semestre) {

        return matriculaService.matricularAluno(
                idAluno,
                idTurma,
                ano,
                semestre
        );
    }

    public List<Cursa> listarMatriculas() {
        return matriculaService.listarMatriculas();
    }

    public List<Cursa> listarMatriculasAluno(Integer idAluno) {
        return matriculaService.listarMatriculasAluno(idAluno);
    }

    public String removerMatricula(Integer idCurso) {
        return matriculaService.removerMatricula(idCurso);
    }
}