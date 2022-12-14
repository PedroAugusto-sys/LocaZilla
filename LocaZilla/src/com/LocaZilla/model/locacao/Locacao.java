/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.model.locacao;

import com.LocaZilla.model.acessorios.Acessorios;
import com.LocaZilla.model.cliente.Cliente;
import com.LocaZilla.model.motorista.Motorista;
import com.LocaZilla.model.veiculo.Veiculo;

/**
 *
 * @author pedro
 */
public class Locacao {
    
     private int id;
    private Cliente cliente;
    private Motorista motorista;
    private Veiculo veiculo;
    private Acessorios acessorio;
    private String dataInicio;
    private String dataFim;
    private Float valorDaLocação;
    private Object situacao;

    public Locacao() {
    }

    public Locacao(int id, Cliente cliente, Motorista motorista, Veiculo veiculo, Acessorios acessorio, String dataInicio, String dataFim, Float valorDaLocação, Object situacao) {
        this.id = id;
        this.cliente = cliente;
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.acessorio = acessorio;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorDaLocação = valorDaLocação;
        this.situacao = situacao;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Acessorios getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorios acessorio) {
        this.acessorio = acessorio;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Float getValorDaLocação() {
        return valorDaLocação;
    }

    public void setValorDaLocação(Float valorDaLocação) {
        this.valorDaLocação = valorDaLocação;
    }

    @Override
    public String toString() {
        return id + ";" 
                + cliente.getId() + ";" 
                + motorista.getId()  + ";" 
                + veiculo.getId() + ";" 
                + acessorio.getId() + ";" 
                + dataInicio + ";" 
                + dataFim + ";" 
                + valorDaLocação + ";" 
                + situacao;
    }
    
    
    
}

