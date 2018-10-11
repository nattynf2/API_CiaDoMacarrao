package br.com.ciadomacarrao.CiaDoMacarraoAPI.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.ciadomacarrao.CiaDoMacarraoAPI.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ciadomacarrao.CiaDoMacarraoAPI.model.Usuario;
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
@RequestMapping("/api/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioRepository repository;
    
    @GetMapping("/")
    public List<Usuario> listaUsuarios() {
        return repository.findAll();
    }
    
    @GetMapping("/{idUsuario}")
    public Usuario listaUsuariosPorId(@PathVariable Integer idUsuario) {
        return repository.findById(idUsuario).get();
    }
    
    @PostMapping("/{idUsuario}")
    public Usuario atualizaUsuario(@PathVariable Integer idUsuario, @RequestBody Usuario usuario) {
        usuario.setIdUsuario(idUsuario);
        return repository.save(usuario);
    }
    
    @DeleteMapping("/{idUsuario}")
    public void deletaUsuario(@PathVariable Integer idUsuario) {
        repository.deleteById(idUsuario);
    }
    
    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario usuario){
        return repository.findByNomeLoginAndNomeSenha(usuario.getNomeLogin(), usuario.getNomeSenha());
    }
    
    @PostMapping("/")
    public Usuario salvaUsuario(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    } 
    
}
