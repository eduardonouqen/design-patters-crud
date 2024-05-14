package br.edu.unicesumar.unicesumar.controller;

import br.edu.unicesumar.unicesumar.domain.UniCesumar;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/banco")
public class UniCesumarController extends CrudController<UniCesumar, Long> {



}
