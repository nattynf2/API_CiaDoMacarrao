/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ciadomacarrao.CiaDoMacarraoAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ciadomacarrao.CiaDoMacarraoAPI.model.Pedido;
import java.util.List;

/**
 *
 * @author FAMILIA FREITAS
 */
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    public List<Pedido> findByNomeUsuario(String usuario);
    
}
