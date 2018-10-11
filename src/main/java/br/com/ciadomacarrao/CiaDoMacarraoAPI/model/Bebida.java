/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ciadomacarrao.CiaDoMacarraoAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author FAMILIA FREITAS
 */

@Entity
@Table(name = "bebidas")
public class Bebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bebida")
    private int idBebida;
    @Column(name = "nm_bebida")
    private String nomeBebida;
    @Column(name = "vl_preco")
    private Double valorPreco;
    @Column(name = "qt_bebida")
    private int quantidadeBebida;
    
    public int getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(int idBebida) {
        this.idBebida= idBebida;
    }
    
    public String getNomeBebida() {
        return nomeBebida;
    }

    public void setNomeBebida(String nomeBebida) {
        this.nomeBebida = nomeBebida;
    }
    
    public Double getValorPreco() {
        return valorPreco;
    }
    
    public void setValorPreco(Double valorPreco) {
        this.valorPreco = valorPreco;
    }
    
    public int getQuantidadeBebida() {
        return quantidadeBebida;
    }

    public void setQuantidadeBebida(int quantidadeBebida) {
        this.quantidadeBebida = quantidadeBebida;
    }
}
