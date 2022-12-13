/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.model.veiculo;

import com.LocaZilla.model.modelo.Modelo;
import java.util.Date;

/**
 *
 * @author pedro
 */
public class Veiculo {

    private int id;
    private String placa;
    private Disponibilidade disponibilidade;
    private int renavam;
    private float precoDeCompra;
    private float precoDeVenda;
    private Date anoFabricacao;
    private Date anoModelo;
    private TipoDoCombustivel combustivel;
    private int quilometragem;
    private TipoDoVeiculo tipoDoVeiculo;
    private Categoria categoria;
    private Modelo modelo;

    //Metodo
    public Veiculo(int id, String placa, Disponibilidade disponibilidade, int renavam, float precoDeCompra, float precoDeVenda, Date anoFabricacao, Date anoModelo, TipoDoCombustivel combustivel, int quilometragem, TipoDoVeiculo tipoDoVeiculo, Categoria categoria, Modelo modelo) {
        this.id = id;
        this.placa = placa;
        this.disponibilidade = disponibilidade;
        this.renavam = renavam;
        this.precoDeCompra = precoDeCompra;
        this.precoDeVenda = precoDeVenda;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.tipoDoVeiculo = tipoDoVeiculo;
        this.categoria = categoria;
        this.modelo = modelo;
    }

    public Veiculo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public float getPrecoDeCompra() {
        return precoDeCompra;
    }

    public void setPrecoDeCompra(float precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    public float getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(float precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Date getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    public TipoDoCombustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(TipoDoCombustivel combustivel) {
        this.combustivel = combustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public TipoDoVeiculo getTipoDoVeiculo() {
        return tipoDoVeiculo;
    }

    public void setTipoDoVeiculo(TipoDoVeiculo tipoDoVeiculo) {
        this.tipoDoVeiculo = tipoDoVeiculo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return id + ";"
                + placa + ";"
                + disponibilidade + ";"
                + renavam + ";"
                + precoDeCompra + ";"
                + precoDeVenda + ";"
                + anoFabricacao + ";"
                + anoModelo + ";"
                + combustivel + ";"
                + quilometragem + ";"
                + tipoDoVeiculo + ";"
                + categoria.getId() + ";"
                + modelo.getIdModelo();
    }

}
