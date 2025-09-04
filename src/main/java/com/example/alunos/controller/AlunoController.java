package com.example.alunos.controller;

import com.example.alunos.model.Aluno;
import com.example.alunos.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public Aluno addAluno(@RequestBody Aluno aluno) {
        return alunoService.addAluno(aluno);
    }

    @GetMapping
    public List<Aluno> getAllAlunos() {
        return alunoService.getAllAlunos();
    }

    @GetMapping("/{id}")
    public Optional<Aluno> getAlunoById(@PathVariable Long id) {
        return alunoService.getAlunoById(id);
    }

    @PutMapping("/{id}")
    public Optional<Aluno> updateAluno(@PathVariable Long id, @RequestBody Aluno aluno) {
        return alunoService.updateAluno(id, aluno);
    }

    @DeleteMapping("/{id}")
    public String deleteAluno(@PathVariable Long id) {
        boolean removed = alunoService.deleteAluno(id);
        return removed ? "Aluno removido com sucesso!" : "Aluno não encontrado!";
    }
}
