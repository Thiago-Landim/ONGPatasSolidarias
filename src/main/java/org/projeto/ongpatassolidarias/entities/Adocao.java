package org.projeto.ongpatassolidarias.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Adocao")
public class Adocao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Animal_id")
    private Animal animal;

    @ManyToOne
    @JoinColumn(name = "Pessoa_id")
    private Pessoa pessoa;

    @Column(name = "Data_adocao")
    private LocalDate dataAdocao;

}
