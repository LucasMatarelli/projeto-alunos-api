package com.example.alunos.service;

import com.example.alunos.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {
    private List<Aluno> alunos = new ArrayList<>();
    private Long nextId = 1L;

    public Aluno addAluno(Aluno aluno) {
        aluno.setId(nextId++);
        alunos.add(aluno);
        return aluno;
    }

    public List<Aluno> getAllAlunos() {
        return alunos;
    }

    public Optional<Aluno> getAlunoById(Long id) {
        return alunos.stream().filter(a -> a.getId().equals(id)).findFirst();
    }

    public Optional<Aluno> updateAluno(Long id, Aluno alunoAtualizado) {
        return getAlunoById(id).map(aluno -> {
            aluno.setNome(alunoAtualizado.getNome());
            aluno.setCurso(alunoAtualizado.getCurso());
            return aluno;
        });
    }

    public boolean deleteAluno(Long id) {
        return alunos.removeIf(a -> a.getId().equals(id));
    }
}
