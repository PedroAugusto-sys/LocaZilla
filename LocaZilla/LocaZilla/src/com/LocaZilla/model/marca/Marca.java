/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.model.marca;
/**
 *
 * @author pedro
 */
public class Marca implements Comparable<Marca> {
private int id = 0;
    private String descricao = "";
    private String url = "";
    //Metodos
    public Marca(){
    }
    public Marca(int id, String descricao, String url){
        this.id = id;
        this.descricao = descricao;
        this.url = url;
    }
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
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    @Override
    public String toString() {
        return id + ";" + descricao + ";" + url;
    }
    
    @Override
    public int compareTo(Marca id ) {
        if(this.id == id.getId()) return(this.id++);
        else  return(this.id - id.getId());

    }
}