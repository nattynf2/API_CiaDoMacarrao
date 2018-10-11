package br.com.ciadomacarrao.CiaDoMacarraoAPI.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.ciadomacarrao.CiaDoMacarraoAPI.repository.BebidaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ciadomacarrao.CiaDoMacarraoAPI.model.Bebida;
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
@RequestMapping("/api/bebidas")
public class BebidaController {
    
    @Autowired
    private BebidaRepository repository;
    
    @GetMapping("/")
    public List<Bebida> listaBebidas() {
        return repository.findAll();
    }
    
    @GetMapping("/{idBebida}")
    public Bebida listaBebidasPorId(@PathVariable Integer idBebida) {
        return repository.findById(idBebida).get();
    }
    
    @PostMapping("/{idBebida}")
    public Bebida atualizaBebida(@PathVariable Integer idBebida, @RequestBody Bebida bebida) {
        bebida.setIdBebida(idBebida);
        return repository.save(bebida);
    }
    
    @DeleteMapping("/{idBebida}")
    public void deletaBebida(@PathVariable Integer idBebida) {
        repository.deleteById(idBebida);
    }
    
    @PostMapping("/")
    public Bebida salvaBebida(@RequestBody Bebida bebida) {
        return repository.save(bebida);
    } 
    
}