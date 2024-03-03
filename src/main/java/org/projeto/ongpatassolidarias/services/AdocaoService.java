package org.projeto.ongpatassolidarias.services;

import org.projeto.ongpatassolidarias.entities.Adocao;
import org.projeto.ongpatassolidarias.entities.Animal;
import org.projeto.ongpatassolidarias.entities.Pessoa;
import org.projeto.ongpatassolidarias.repositories.AdocaoRepository;
import org.projeto.ongpatassolidarias.repositories.AnimalRepository;
import org.projeto.ongpatassolidarias.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AdocaoService {

    @Autowired
    private AdocaoRepository adocaoRepository;

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    public void realizarAdocao(Adocao adocao) {
        Animal animal = adocao.getAnimal();
        Pessoa pessoa = adocao.getPessoa();

        // Verifica se o animal e a pessoa existem
        animalRepository.findById(animal.getId()).orElseThrow(() -> new RuntimeException("Animal não encontrado"));
        pessoaRepository.findById(pessoa.getId()).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));

        adocao.setDataAdocao(LocalDate.now());

        // Salva a adoção
        adocaoRepository.save(adocao);

        // Atualiza o estado do animal para adotado
        animal.setAdotado(true);
        animalRepository.save(animal);
    }

    public List<Adocao> listarTodasAdocoes() {
        return adocaoRepository.findAll();
    }

    public Optional<Adocao> buscarAdocaoPorId(Long id) {
       return  adocaoRepository.findById(id);
    }

}

