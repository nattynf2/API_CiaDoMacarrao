/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ciadomacarrao.CiaDoMacarraoAPI.repository;

import br.com.ciadomacarrao.CiaDoMacarraoAPI.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author FAMILIA FREITAS
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
    Usuario findByNomeLoginAndNomeSenha(String nomeLogin, String nomeSenha);
    
}
