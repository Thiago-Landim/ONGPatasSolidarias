package org.projeto.ongpatassolidarias.repositories;

import org.projeto.ongpatassolidarias.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
