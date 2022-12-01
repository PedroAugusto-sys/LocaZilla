/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.model.acessorios;

/**
 *
 * @author hugo_
 */
public class Acessorios {
    
    //Atributos
    private int idAcessorios = 0;
    private String descricao = "";
    private double valorDaLocacao = 0;
    
    //Construtor

    public Acessorios(int idAcessorios, String descricao, double valorDaLocacao) {
        this.idAcessorios = idAcessorios;
        this.descricao = descricao;
        this.valorDaLocacao = valorDaLocacao;
    }

    public Acessorios() {
    }
    
    //Getter + Setter

    public int getIdAcessorios() {
        return idAcessorios;
    }

    public void setIdAcessorios(int idAcessorios) {
        this.idAcessorios = idAcessorios;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorDaLocacao() {
        return valorDaLocacao;
    }

    public void setValorDaLocacao(double valorDaLocacao) {
        this.valorDaLocacao = valorDaLocacao;
    }
    
    @Override
    public String toString() {
        return idAcessorios + ";" + descricao + ";" + valorDaLocacao;
    }
    
    
}
