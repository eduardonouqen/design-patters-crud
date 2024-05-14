package br.edu.unicesumar.unicesumar.domain;

import br.edu.unicesumar.unicesumar.domain.enums.MateriasProfessor;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "db_professor")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Professor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String documento;
    private MateriasProfessor materiasProfessor;

}
