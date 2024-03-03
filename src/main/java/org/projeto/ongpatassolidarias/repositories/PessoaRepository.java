package org.projeto.ongpatassolidarias.repositories;

import org.projeto.ongpatassolidarias.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
