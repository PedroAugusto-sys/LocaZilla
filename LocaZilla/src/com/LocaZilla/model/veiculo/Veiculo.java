/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.model.veiculo;

import java.util.Date;

/**
 *
 * @author hugo_
 */
public class Veiculo {
    
    //Atributos
    private int idVeiculo = 0;
    private String placa = "";
    private int renavam = 0;
    private double precoDeCompra = 0.0;
    private double precoDeVenda = 0.0;
    private Date anoFabricacao;
    private Date anoModelo;
    private int quilometragem = 0;
    private TipoDoCombustivel tipoCombustivel;
    private TipoDoVeiculo tipoVeiculo; 
    private SituacaoDoVeiculo situacaoVeiculo;
    
    //Constructor

    public Veiculo(int idVeiculo, String placa, int renavam, double precoDeCompra, double precoDeVenda, Date anoFabricacao, Date anoModelo, int quilometragem, TipoDoCombustivel tipoCombustivel, TipoDoVeiculo tipoVeiculo, SituacaoDoVeiculo situacaoVeiculo) {
        this.idVeiculo = idVeiculo;
        this.placa = placa;
        this.renavam = renavam;
        this.precoDeCompra = precoDeCompra;
        this.precoDeVenda = precoDeVenda;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.quilometragem = quilometragem;
        this.tipoCombustivel = tipoCombustivel;
        this.tipoVeiculo = tipoVeiculo;
        this.situacaoVeiculo = situacaoVeiculo;
    }
    
    public Veiculo(){
        
    }
    
    //Getter + Setters

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public double getPrecoDeCompra() {
        return precoDeCompra;
    }

    public void setPrecoDeCompra(double precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
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

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public TipoDoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoDoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public TipoDoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoDoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public SituacaoDoVeiculo getSituacaoVeiculo() {
        return situacaoVeiculo;
    }

    public void setSituacaoVeiculo(SituacaoDoVeiculo situacaoVeiculo) {
        this.situacaoVeiculo = situacaoVeiculo;
    }

    @Override
    public String toString() {
        return idVeiculo + ";" + placa + ";" + renavam + ";" + precoDeCompra + ";" + precoDeVenda + ";" + anoFabricacao + ";" + anoModelo + ";" + quilometragem + ";" + tipoCombustivel + ";" + tipoVeiculo + ";" + situacaoVeiculo;
    }
    
    public enum TipoDoCombustivel {
        GASOLINA, DIESEL, FLEX, ELETRICO, GNV
    }
    
    public enum TipoDoVeiculo {
        HATCH, SEDAN, SUV, PICKUP
    }
    
    public enum SituacaoDoVeiculo {
        DISPONIVEL, LOCADO, VENDIDO
    }
    
    
}
