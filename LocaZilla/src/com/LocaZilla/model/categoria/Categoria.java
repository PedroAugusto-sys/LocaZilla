/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.model.categoria;

/**
 *
 * @author pedro
 */
public class Categoria {
    private int id;
    private String descricao;
    private float valorDaLocacao;

    public Categoria(int id, String descricao, float valorDaLocacao) {
        this.id = id;
        this.descricao = descricao;
        this.valorDaLocacao = valorDaLocacao;
    }

    public Categoria() {
    }

    
    //Getters Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorDaLocacao() {
        return valorDaLocacao;
    }

    public void setValorDaLocacao(float valorDaLocacao) {
        this.valorDaLocacao = valorDaLocacao;
    }

    @Override
    public String toString() {
        return id + "+" + descricao + "+" + valorDaLocacao;
    }
    
    
    
    
    
}
