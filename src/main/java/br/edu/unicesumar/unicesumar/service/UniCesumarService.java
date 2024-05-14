package br.edu.unicesumar.unicesumar.service;

import br.edu.unicesumar.unicesumar.domain.UniCesumar;
import br.edu.unicesumar.unicesumar.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniCesumarService extends CrudService<UniCesumar, Long> {

    @Autowired
    private CrudRepository<UniCesumar, Long> repository;

    public List<UniCesumar> findAll() {
        return repository.findAll();
    }

    public Optional<UniCesumar> findById(Long id) {
        return repository.findById(id);
    }

    public UniCesumar save(UniCesumar uniCesumar) {
        return repository.save(uniCesumar);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}