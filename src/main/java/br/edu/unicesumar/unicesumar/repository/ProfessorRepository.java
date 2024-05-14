package br.edu.unicesumar.unicesumar.repository;

import br.edu.unicesumar.unicesumar.domain.Professor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Long> {



}
