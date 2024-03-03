package org.projeto.ongpatassolidarias.controller;

import org.projeto.ongpatassolidarias.entities.Pessoa;
import org.projeto.ongpatassolidarias.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Pessoa")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @GetMapping("/listaPessoa")
    public ResponseEntity<List<Pessoa>> lista() {
        List<Pessoa> pessoa = pessoaService.listaPessoas();
        return new ResponseEntity<>(pessoa, HttpStatus.OK);
    }

    @GetMapping("Pessoa/{id}")
    public ResponseEntity<Optional<Pessoa>> idPessoa(@PathVariable Long id) {
        Optional<Pessoa> pessoa = pessoaService.buscarIdPessoa(id);
        return ResponseEntity.ok(pessoa);

    }

    @PostMapping("/SalvarPessoa")
    public ResponseEntity<Pessoa> salvar(Pessoa pessoa){
        pessoaService.salvarPessoa(pessoa);
        return ResponseEntity.ok(pessoa);
    }

    @DeleteMapping("/deletarPessoa/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarPessoa(@PathVariable Long id){
        pessoaService.deletar(id);
    }

}
