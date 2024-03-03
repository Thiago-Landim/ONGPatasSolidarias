package org.projeto.ongpatassolidarias.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Pessoa_id")
    private Long id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "email")
    private String email;
}
