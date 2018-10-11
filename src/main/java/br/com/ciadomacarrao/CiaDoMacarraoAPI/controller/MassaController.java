package br.com.ciadomacarrao.CiaDoMacarraoAPI.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.ciadomacarrao.CiaDoMacarraoAPI.repository.MassaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ciadomacarrao.CiaDoMacarraoAPI.model.Massa;
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
@RequestMapping("/api/massas")
public class MassaController {
    
    @Autowired
    private MassaRepository repository;
    
    @GetMapping("/")
    public List<Massa> listaMassas() {
        return repository.findAll();
    }

    @GetMapping("/{idMassa}")
    public Massa listaMassasPorId(@PathVariable Integer idMassa) {
        return repository.findById(idMassa).get();
    }
    
    @PostMapping("/{idMassa}")
    public Massa atualizaMassa(@PathVariable Integer idMassa, @RequestBody Massa massa) {
        massa.setIdMassa(idMassa);
        return repository.save(massa);
    }
    
    @DeleteMapping("/{idMassa}")
    public void deletaMassa(@PathVariable Integer idMassa) {
        repository.deleteById(idMassa);
    }
    
    @PostMapping("/")
    public Massa salvaMassa(@RequestBody Massa massa) {
        return repository.save(massa);
    } 
    
}