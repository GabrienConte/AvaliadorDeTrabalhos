package br.csi.avaliadordeprojetos.controller;

import br.csi.avaliadordeprojetos.model.Aluno;
import br.csi.avaliadordeprojetos.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @GetMapping("/teste")
    public String teste(){
        return "Teste api REST";
    }

    @PostMapping("/print-json")
    public void printJson(@RequestBody String json){
        System.out.println(json);
    }

    @PostMapping
    public void cadastrar(@RequestBody Aluno aluno){
        this.service.saveAluno(aluno);
    }

    @GetMapping
    public List<Aluno> listar(){
        return this.service.getAlunos();
    }
    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid Aluno aluno) {
        this.service.atualizaAluno(aluno);

        return  ResponseEntity.ok(aluno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Long id) {
        this.service.deleteAluno(id);
        return ResponseEntity.noContent().build();
    }
}
