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
@Table(name = "adicionais")
public class Adicional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adicional")
    private int idAdicional;
    @Column(name = "nm_adicional")
    private String nomeAdicional;
    @Column(name = "vl_preco")
    private Double valorPreco;
    @Column(name = "qt_adicional")
    private int quantidadeAdicional;
    
    public int getIdAdicional() {
        return idAdicional;
    }

    public void setIdAdicional(int idAdicional) {
        this.idAdicional = idAdicional;
    }
    
    public String getNomeAdicional() {
        return nomeAdicional;
    }

    public void setNomeAdicional(String nomeAdicional) {
        this.nomeAdicional = nomeAdicional;
    }
    
    public Double getValorPreco() {
        return valorPreco;
    }
    
    public void setValorPreco(Double valorPreco) {
        this.valorPreco = valorPreco;
    }
    
    public int getQuantidadeAdicional() {
        return quantidadeAdicional;
    }

    public void setQuantidadeAdicional(int quantidadeAdicional) {
        this.quantidadeAdicional = quantidadeAdicional;
    }
}