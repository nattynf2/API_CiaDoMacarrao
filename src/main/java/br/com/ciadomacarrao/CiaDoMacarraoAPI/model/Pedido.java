/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ciadomacarrao.CiaDoMacarraoAPI.model;

import java.util.Date;
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
@Table(name = "pedidos")
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private int id;
    @Column(name = "nm_massa")
    private String nomeMassa;
    @Column(name = "nm_molho")
    private String nomeMolho;
    @Column(name = "nm_adicional")
    private String nomeAdicional;
    @Column(name = "qtd_comida")
    private int quantidadeComida;
    @Column(name = "nm_bebida")
    private String nomeBebida;
    @Column(name = "qtd_bebida")
    private int quantidadeBebida;
    @Column(name = "valor_total")
    private Double valorTotal;
    @Column(name = "dt_pedido")
    private Date dataPedido;
    @Column(name = "nm_usuario")
    private String nomeUsuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeMassa() {
        return nomeMassa;
    }

    public void setNomeMassa(String nomeMassa) {
        this.nomeMassa = nomeMassa;
    }

    public String getNomeMolho() {
        return nomeMolho;
    }

    public void setNomeMolho(String nomeMolho) {
        this.nomeMolho = nomeMolho;
    }

    public String getNomeAdicional() {
        return nomeAdicional;
    }

    public void setNomeAdicional(String nomeAdicional) {
        this.nomeAdicional = nomeAdicional;
    }

    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }

    public String getNomeBebida() {
        return nomeBebida;
    }

    public void setNomeBebida(String nomeBebida) {
        this.nomeBebida = nomeBebida;
    }

    public int getQuantidadeBebida() {
        return quantidadeBebida;
    }

    public void setQuantidadeBebida(int quantidadeBebida) {
        this.quantidadeBebida = quantidadeBebida;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
}
