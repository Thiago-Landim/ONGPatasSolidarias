package org.projeto.ongpatassolidarias.services;

import org.projeto.ongpatassolidarias.entities.Animal;
import org.projeto.ongpatassolidarias.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    AnimalRepository animalRepository;

    public Animal salvarAnimal(Animal animalsalvo){
        return animalRepository.save(animalsalvo);
    }

    public List<Animal> listarAnimais(){
        return animalRepository.findAll();
    }
    public Optional<Animal> buscaID(Long id){
       return animalRepository.findById(id);
    }

    public void deletarAnimal(Long id){
        Optional<Animal> optionalAnimal = animalRepository.findById(id);
        animalRepository.deleteById(id);

    }


}

