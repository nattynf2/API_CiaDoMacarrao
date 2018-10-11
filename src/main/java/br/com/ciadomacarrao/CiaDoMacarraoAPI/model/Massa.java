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
@Table(name = "massas")
public class Massa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_massa")
    private int idMassa;
    @Column(name = "nm_massa")
    private String nomeMassa;
    @Column(name = "vl_preco")
    private Double valorPreco;
    @Column(name = "qt_massa")
    private int quantidadeMassa;
    
    public int getId() {
        return idMassa;
    }

    public void setIdMassa(int idMassa) {
        this.idMassa = idMassa;
    }
    
    public String getNomeMassa() {
        return nomeMassa;
    }

    public void setNomeMassa(String nomeMassa) {
        this.nomeMassa = nomeMassa;
    }
    
    public Double getValorPreco() {
        return valorPreco;
    }
    
    public void setValorPreco(Double valorPreco) {
        this.valorPreco = valorPreco;
    }
    
    public int getQuantidadeMassa() {
        return quantidadeMassa;
    }

    public void setQuantidadeMassa(int quantidadeMassa) {
        this.quantidadeMassa = quantidadeMassa;
    }
}