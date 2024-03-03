package org.projeto.ongpatassolidarias.repositories;


import org.projeto.ongpatassolidarias.entities.Adocao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;




@EnableJpaRepositories

public interface AdocaoRepository extends JpaRepository<Adocao, Long> {



}
