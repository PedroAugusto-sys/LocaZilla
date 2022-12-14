/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.model.locacao;


/**
 *
 * @author pedro
 */
public class Locacao {
    private int id;
    private String dataInicio;
    private String dataFim;
    private double valorDaLocacao;
    private SituacaoDaLocacao situacaoDaLocacao;

    
    
       //Metodos
    public Locacao(int id, String dataInicio, String dataFim, double valorDaLocacao, SituacaoDaLocacao situacaoDaLocacao) {
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

    
        public String toString(SituacaoDaLocacao situacaoDaLocacao) {

        if (situacaoDaLocacao.equals(SituacaoDaLocacao.CANCELAR)) {
            return id + ";" + dataInicio + ";" + dataFim + ";" + valorDaLocacao + ";" + situacaoDaLocacao.CANCELAR ;
        }
        if (situacaoDaLocacao.equals(SituacaoDaLocacao.DEVOLVER)) {
            return id +";"+ dataInicio +";" + dataFim + ";"+ valorDaLocacao + ";" + situacaoDaLocacao.DEVOLVER ;
        }
         if (situacaoDaLocacao.equals(SituacaoDaLocacao.LISTAGEM)) {
            return id + ";"+ dataInicio +";" + dataFim + ";"+ valorDaLocacao + ";" + situacaoDaLocacao.LISTAGEM ;
        }
        if (situacaoDaLocacao.equals(SituacaoDaLocacao.DEVOLVER)) {
            return id + ";" + dataInicio + ";" + dataFim + ";" + valorDaLocacao + ";" + situacaoDaLocacao.LOCAR ;
        }
        
        else{
        return null;
        }
       
    }
    
    @Override
    public String toString() {
        return  id + ";" + dataInicio + ";" + dataFim + ";" + valorDaLocacao + ";" + situacaoDaLocacao ;
    }

  
    
    
    
    
}
