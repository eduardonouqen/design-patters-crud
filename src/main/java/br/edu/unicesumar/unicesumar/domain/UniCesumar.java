package br.edu.unicesumar.unicesumar.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "db_faculdade")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UniCesumar {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cidade;
    private String endereco;

}
