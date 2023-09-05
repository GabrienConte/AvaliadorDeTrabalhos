package br.csi.avaliadordeprojetos.service;

import br.csi.avaliadordeprojetos.model.Aluno;
import br.csi.avaliadordeprojetos.model.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public Aluno getAlunoById(Long Id) {
        return repository.findById(Id).get();
    }

    public List<Aluno> getAlunos() {
        return repository.findAll();
    }

    public Aluno saveAluno(Aluno aluno) {
        return repository.save(aluno);
    }

    public void atualizaAluno(Aluno aluno) {
        Aluno a = this.repository.getReferenceById(aluno.getId());
        a.setNome(aluno.getNome());
        a.setEmail(aluno.getEmail());
        a.setMatricula((aluno.getMatricula()));
        a.setEndereco(aluno.getEndereco());
    }

    public void deleteAluno(Long Id) {
       repository.deleteById(Id);
    }
}
