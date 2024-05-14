package br.edu.unicesumar.unicesumar.service;

import br.edu.unicesumar.unicesumar.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CrudService<T, ID> {

    @Autowired
    private CrudRepository<T, ID> repository;

    public List<T> todos() {

        return repository.findAll();
    }

    public T porId(ID id) {

        return repository.findById(id).orElse(null);
    }

    public T salvar(T entidade) {
        return repository.save(entidade);
    }

    public void deletar(ID id) {
        repository.deleteById(id);
    }

}
