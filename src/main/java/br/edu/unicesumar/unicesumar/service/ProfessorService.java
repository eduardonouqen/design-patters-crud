package br.edu.unicesumar.unicesumar.service;

import br.edu.unicesumar.unicesumar.domain.Professor;
import br.edu.unicesumar.unicesumar.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService extends CrudService<Professor, Long> {

    @Autowired
    private CrudRepository<Professor, Long> repository;

    public List<Professor> findAll() {
        return repository.findAll();
    }

    public Optional<Professor> findById(Long id) {
        return repository.findById(id);
    }

    public Professor save(Professor professor) {
        return repository.save(professor);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}