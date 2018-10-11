
package br.com.ciadomacarrao.CiaDoMacarraoAPI.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.ciadomacarrao.CiaDoMacarraoAPI.model.Adicional;
import br.com.ciadomacarrao.CiaDoMacarraoAPI.model.Bebida;
import br.com.ciadomacarrao.CiaDoMacarraoAPI.model.Massa;
import br.com.ciadomacarrao.CiaDoMacarraoAPI.model.Molho;
import br.com.ciadomacarrao.CiaDoMacarraoAPI.repository.PedidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ciadomacarrao.CiaDoMacarraoAPI.model.Pedido;
import br.com.ciadomacarrao.CiaDoMacarraoAPI.repository.AdicionalRepository;
import br.com.ciadomacarrao.CiaDoMacarraoAPI.repository.BebidaRepository;
import br.com.ciadomacarrao.CiaDoMacarraoAPI.repository.MassaRepository;
import br.com.ciadomacarrao.CiaDoMacarraoAPI.repository.MolhoRepository;
import java.util.Date;
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
@RequestMapping("/api/pedidos")
public class PedidoController {
    
    @Autowired
    private PedidoRepository pedidoRepository;
    
    @Autowired
    private AdicionalRepository adicionalRepository;
    
    @Autowired
    private BebidaRepository bebidaRepository;
    
    @Autowired
    private MassaRepository massaRepository;
    
    @Autowired
    private MolhoRepository molhoRepository;
    
    @GetMapping("/")
    public List<Pedido> listaPedidos() {
        return pedidoRepository.findAll();
    }
    
    @GetMapping("/usuario/{usuario}")
    public List<Pedido> listaPedidosPorUsuario(@PathVariable String usuario) {
        return pedidoRepository.findByNomeUsuario(usuario);
    }
    
    @GetMapping("/{id}")
    public Pedido listaPedidosPorId(@PathVariable Integer id) {
        return pedidoRepository.findById(id).get();
    }
    
    @PostMapping("/{id}")
    public Pedido atualizaPedido(@PathVariable Integer id, @RequestBody Pedido pedido) {
        pedido.setId(id);
        return pedidoRepository.save(pedido);
    }
    
    @DeleteMapping("/{id}")
    public void deletaPedido(@PathVariable Integer id) {
        pedidoRepository.deleteById(id);
    }
    
    @PostMapping("/")
    public Pedido salvaPedido(@RequestBody Pedido pedido) {
        
        double total = calculaValor(pedido);
        
        pedido.setValorTotal(total);
        
        pedido.setDataPedido(new Date());
        return pedidoRepository.save(pedido);
    } 
    
    @PostMapping("/calcular")
    public Double calculaValor(@RequestBody Pedido pedido) {
        
        double total = 0;
        String nomeAdicional = pedido.getNomeAdicional();
        Adicional adicional = adicionalRepository.findByNomeAdicional(nomeAdicional);
        if (adicional != null) {
            total += adicional.getValorPreco();
        }
        
        String nomeBebida = pedido.getNomeBebida();
        Bebida bebida = bebidaRepository.findByNomeBebida(nomeBebida);
        if (bebida != null) {
            total += bebida.getValorPreco() * pedido.getQuantidadeBebida();
        }
        
        String nomeMassa = pedido.getNomeMassa();
        Massa massa = massaRepository.findByNomeMassa(nomeMassa);
        if (massa != null) {
            total += massa.getValorPreco() * pedido.getQuantidadeComida();
        }
        
        String nomeMolho = pedido.getNomeMolho();
        Molho molho = molhoRepository.findByNomeMolho(nomeMolho);
        if (molho != null) {
            total += molho.getValorPreco() * pedido.getQuantidadeComida();
        }
        
        return total;
    }
    
}
