/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.model.modelo;

import com.LocaZilla.model.marca.Marca;

/**
 *
 * @author pedro
 */
public class Modelo implements Comparable<Modelo> {

    private int idModelo = 0;
    private String descricao = "";
    private String url = "";
    private Marca marca = null;

    // Métodos
    public Modelo() {

    }

    public Modelo(int idModelo, String descricao, String url) {
        this.idModelo = idModelo;
        this.descricao = descricao;
        this.url = url;
    }

    public Modelo(int idModelo, String descricao, String url, Marca marca) {
        this.idModelo = idModelo;
        this.descricao = descricao;
        this.url = url;
        this.marca = marca;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return idModelo + ";" + descricao + ";" + url + ";" + marca.getId();
    }

    @Override
    public int compareTo(Modelo id) {
        if (this.idModelo == id.getIdModelo()) {
            return (this.idModelo++);
        } else {
            return (this.idModelo - id.getIdModelo());
        }
    }
}
