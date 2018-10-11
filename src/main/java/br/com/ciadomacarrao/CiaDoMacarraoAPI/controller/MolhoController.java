package br.com.ciadomacarrao.CiaDoMacarraoAPI.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.ciadomacarrao.CiaDoMacarraoAPI.repository.MolhoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ciadomacarrao.CiaDoMacarraoAPI.model.Molho;
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
@RequestMapping("/api/molhos")
public class MolhoController {
    
    @Autowired
    private MolhoRepository repository;
    
    @GetMapping("/")
    public List<Molho> listaMolhos() {
        return repository.findAll();
    }
    
    @GetMapping("/{idMolho}")
    public Molho listaMolhosPorId(@PathVariable Integer idMolho) {
        return repository.findById(idMolho).get();
    }
    
    @PostMapping("/{idMolho}")
    public Molho atualizaMolho(@PathVariable Integer idMolho, @RequestBody Molho molho) {
        molho.setIdMolho(idMolho);
        return repository.save(molho);
    }
    
    @DeleteMapping("/{idMolho}")
    public void deletaMolho(@PathVariable Integer idMolho) {
        repository.deleteById(idMolho);
    }
    
    @PostMapping("/")
    public Molho salvaMolho(@RequestBody Molho molho) {
        return repository.save(molho);
    } 
    
}