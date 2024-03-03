package org.projeto.ongpatassolidarias.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Raca")
    private String raca;

    @Column(name = "Tipo")
    private String tipoAnimal;

    @Column(name = "Idade")
    private int idade;

    @Column(name = "Adotado")
    private boolean adotado;


}
