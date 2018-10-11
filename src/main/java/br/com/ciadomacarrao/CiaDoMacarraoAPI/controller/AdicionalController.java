package br.com.ciadomacarrao.CiaDoMacarraoAPI.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.ciadomacarrao.CiaDoMacarraoAPI.repository.AdicionalRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ciadomacarrao.CiaDoMacarraoAPI.model.Adicional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author FAMILIA FREITAS
 */
@RestController
@RequestMapping("/api/adicionais")
public class AdicionalController {
    
    @Autowired
    private AdicionalRepository repository;
    
    @GetMapping("/")
    public List<Adicional> listaAdicional() {
        return repository.findAll();
    }
    
    @GetMapping("/{idAdicional}")
    public Adicional listaAdicionalPorId(@PathVariable Integer idAdicional) {
        return repository.findById(idAdicional).get();
    }
    
    @PostMapping("/{idAdicional}")
    public Adicional atualizaAdicional(@PathVariable Integer idAdicional, @RequestBody Adicional adicional) {
        adicional.setIdAdicional(idAdicional);
        return repository.save(adicional);
    }
    
    @DeleteMapping("/{idAdicional}")
    public void deletaAdicional(@PathVariable Integer idAdicional) {
        repository.deleteById(idAdicional);
    }
    
    @PostMapping("/")
    public Adicional salvaMassa(@RequestBody Adicional adicional) {
        return repository.save(adicional);
    } 
    
}