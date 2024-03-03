package org.projeto.ongpatassolidarias.controller;

import org.projeto.ongpatassolidarias.entities.Adocao;
import org.projeto.ongpatassolidarias.services.AdocaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/adocoes")
public class AdocaoController {


    @Autowired
    AdocaoService adocaoService;

    @GetMapping("/ListaAdocao")
    public List<Adocao> listarAdocoes() {
        return adocaoService.listarTodasAdocoes();
    }

    @GetMapping("adocao/{id}")
    public Optional<Adocao> obterAdocaoPorId(@PathVariable Long id) {
        return adocaoService.buscarAdocaoPorId(id);
    }

    @PostMapping("/SalvarAdocao")
    public ResponseEntity<Adocao> saveAdocao(@RequestBody Adocao adocao) {
        adocaoService.realizarAdocao(adocao);
        return ResponseEntity.ok(adocao);
    }


}
