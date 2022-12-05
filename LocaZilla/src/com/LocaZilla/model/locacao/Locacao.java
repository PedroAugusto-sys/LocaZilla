/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.model.locacao;

import java.util.Date;

/**
 *
 * @author pedro
 */
public class Locacao {
    private int id;
    private Date dataInicio;
    private Date dataFim;
    private double valorDaLocacao;
    private SituacaoDaLocacao situacaoDaLocacao;

    
    
       //Metodos
    public Locacao(int id, Date dataInicio, Date dataFim, double valorDaLocacao, SituacaoDaLocacao situacaoDaLocacao) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorDaLocacao = valorDaLocacao;
        this.situacaoDaLocacao = situacaoDaLocacao;
    }
    public Locacao() {
    }
    
    
    //Getters+Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public double getValorDaLocacao() {
        return valorDaLocacao;
    }

    public void setValorDaLocacao(double valorDaLocacao) {
        this.valorDaLocacao = valorDaLocacao;
    }

    public SituacaoDaLocacao getSituacaoDaLocacao() {
        return situacaoDaLocacao;
    }

    public void setSituacaoDaLocacao(SituacaoDaLocacao situacaoDaLocacao) {
        this.situacaoDaLocacao = situacaoDaLocacao;
    }

    @Override
    public String toString() {
        return  id + "+" + dataInicio + "+" + dataFim + "+" + valorDaLocacao + "+" + situacaoDaLocacao ;
    }
    
    
    
    
}
