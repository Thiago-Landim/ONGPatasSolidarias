package org.projeto.ongpatassolidarias.services;

import org.projeto.ongpatassolidarias.entities.Animal;
import org.projeto.ongpatassolidarias.entities.Pessoa;
import org.projeto.ongpatassolidarias.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;


    public Pessoa salvarPessoa(Pessoa pessoasalva){
        return pessoaRepository.save(pessoasalva);

    }
    public Optional<Pessoa> buscarIdPessoa(Long id){
        return pessoaRepository.findById(id);
    }

    public List<Pessoa> listaPessoas(){
        return pessoaRepository.findAll();
    }
    public void  deletar(Long id){
        Optional<Pessoa> optionalPessoa = pessoaRepository.findById(id);
        pessoaRepository.deleteById(id);

    }


}
