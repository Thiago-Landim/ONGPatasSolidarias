package org.projeto.ongpatassolidarias.controller;

import org.projeto.ongpatassolidarias.entities.Animal;
import org.projeto.ongpatassolidarias.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @GetMapping("/listaadocao")
    public ResponseEntity<List<Animal>> listarTodosAnimais() {
        List<Animal> listaAnimais = animalService.listarAnimais();
        // Quando tiver tempo implementar a logica para verificar se tem algo na lista
        return new ResponseEntity<>(listaAnimais, HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Animal>> trazPeloID(@PathVariable Long id) {
        Optional<Animal> animal = animalService.buscaID(id);
        // Quando tiver tempo implementar a logica para verificar se tem id
        return ResponseEntity.ok(animal);

    }

    @PostMapping("/salvarAnimal")
    public ResponseEntity<Animal> salvar(@RequestBody Animal animal){
        animalService.salvarAnimal(animal);
        return ResponseEntity.ok(animal);

    }

    @DeleteMapping("/delete/{id}")
    public void deletarAnimal(Long id){
        animalService.deletarAnimal(id);
    }

}
