package br.edu.unicesumar.unicesumar.controller;

import br.edu.unicesumar.unicesumar.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CrudController<T, ID> {

    @Autowired
    private CrudService<T, ID> service;

    @GetMapping
    public ResponseEntity<List<T>> all() {
        return ResponseEntity.ok(service.todos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> getById(@PathVariable("id") ID id) {
        return ResponseEntity.ok(service.porId(id));
    }

    @PostMapping
    public ResponseEntity<T> save(@RequestBody T entidade) {
        return ResponseEntity.ok(service.salvar(entidade));
    }

}
