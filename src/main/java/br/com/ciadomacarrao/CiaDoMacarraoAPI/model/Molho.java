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
@Table(name = "molhos")
public class Molho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_molho")
    private int idMolho;
    @Column(name = "nm_molho")
    private String nomeMolho;
    @Column(name = "vl_preco")
    private Double valorPreco;
    @Column(name = "qt_molho")
    private int quantidadeMolho;
    
    public int getIdMolho() {
        return idMolho;
    }

    public void setIdMolho(int idMolho) {
        this.idMolho = idMolho;
    }
    
    public String getNomeMolho() {
        return nomeMolho;
    }

    public void setNomeMolho(String nomeMolho) {
        this.nomeMolho = nomeMolho;
    }
    
    public Double getValorPreco() {
        return valorPreco;
    }
    
    public void setValorPreco(Double valorPreco) {
        this.valorPreco = valorPreco;
    }
    
    public int getQuantidadeMolho() {
        return quantidadeMolho;
    }

    public void setQuantidadeMolho(int quantidadeMolho) {
        this.quantidadeMolho = quantidadeMolho;
    }
}