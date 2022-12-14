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
    private int renavam;
    private float precoDeCompra;
    private float precoDeVenda;
    private int anoFabricacao;
    private int anoModelo;
    private Object tipoDeCombutivel;
    private int quilometragem;
    private Object tipoDeVeiculo;
    private Modelo modelo;
    private Object situacao;
    private Categoria categoria;

    public Veiculo() {
    }

    public Veiculo(int id, String placa, int renavam, float precoDeCompra, float precoDeVenda,
            int anoFabricacao, int anoModelo, Object tipoDeCombutivel, int quilometragem,
            Object tipoDeVeiculo, Modelo modelo, Object situacao, Categoria categoria) {
        this.id = id;
        this.placa = placa;
        this.renavam = renavam;
        this.precoDeCompra = precoDeCompra;
        this.precoDeVenda = precoDeVenda;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.tipoDeCombutivel = tipoDeCombutivel;
        this.quilometragem = quilometragem;
        this.tipoDeVeiculo = tipoDeVeiculo;
        this.modelo = modelo;
        this.situacao = situacao;
        this.categoria = categoria;
        
    }

    public Veiculo (int id, String placa, int renavam, float precoDeCompra, float precoDeVenda,
            int anoFabricacao, int anoModelo, Object tipoDeCombutivel, int quilometragem,
            Object tipoDeVeiculo, Object situacao) {
        this.id = id;
        this.placa = placa;
        this.renavam = renavam;
        this.precoDeCompra = precoDeCompra;
        this.precoDeVenda = precoDeVenda;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.tipoDeCombutivel = tipoDeCombutivel;
        this.quilometragem = quilometragem;
        this.tipoDeVeiculo = tipoDeVeiculo;
        this.situacao = situacao;

    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Object getSituacao() {
        return situacao;
    }

    public void setSituacao(Object situacao) {
        this.situacao = situacao;
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

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Object getTipoDeCombutivel() {
        return tipoDeCombutivel;
    }

    public void setTipoDeCombutivel(String tipoDeCombutivel) {
        this.tipoDeCombutivel = tipoDeCombutivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Object getTipoDeVeiculo() {
        return tipoDeVeiculo;
    }

    public void setTipoDeVeiculo(String tipoDeVeiculo) {
        this.tipoDeVeiculo = tipoDeVeiculo;
    }

    public Modelo getModelo() {
        return modelo;
    }
    
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return id + ";" + placa + ";" + renavam + ";" + precoDeCompra + ";" + precoDeVenda + ";" 
                + anoFabricacao + ";" + anoModelo + ";" + tipoDeCombutivel + ";" +  quilometragem
                + ";" + tipoDeVeiculo + ";" + modelo.getIdModelo()+ ";" + situacao + ";" + categoria.getId();
    }
    

}
