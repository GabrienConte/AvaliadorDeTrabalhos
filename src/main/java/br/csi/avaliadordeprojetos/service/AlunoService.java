package br.csi.avaliadordeprojetos.service;

import br.csi.avaliadordeprojetos.model.aluno.Aluno;
import br.csi.avaliadordeprojetos.model.aluno.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public Aluno getAlunoById(Long Id) {
        return repository.getById(Id);
    }

    public List<Aluno> getAlunos() {
        return repository.findAll();
    }

    public Aluno saveAluno(Aluno aluno) {
        return repository.save(aluno);
    }

    public void deleteAluno(Long Id) {
       repository.deleteById(Id);
    }
}
