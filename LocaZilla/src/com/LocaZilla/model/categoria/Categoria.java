/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.model.categoria;

/**
 *
 * @author hugo_
 */
public class Categoria {
    
    //Atributos
    private int idCategoria = 0;
    private String descricao = "";
    private double valorDaLocacao = 0;
    
    //Construtor

    public Categoria(int idCategoria, String descricao, double valorDaLocacao) {
        this.idCategoria = idCategoria;
        this.descricao = descricao;
        this.valorDaLocacao = valorDaLocacao;
    }

    public Categoria() {
    }
    
    //Getter + Setter

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
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
        return idCategoria + ";" + descricao + ";" + valorDaLocacao;
    }
    
    
    
    
}
