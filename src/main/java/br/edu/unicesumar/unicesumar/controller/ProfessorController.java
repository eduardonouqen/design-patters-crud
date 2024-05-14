package br.edu.unicesumar.unicesumar.controller;

import br.edu.unicesumar.unicesumar.domain.Professor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pessoa")
public class ProfessorController extends CrudController<Professor, Long> {



}
