/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.model.operador;

/**
 *
 * @author pedro
 */
public class Operador {
    private int idOperador = 0;
    private String nomeOperador = "";
    private String senhaOperador = "";  
    private String urlOperador = "";

    public Operador() {
    }

    
     public Operador(int idOperador, String nomeOperador, String senhaOperador, String urlOperador) {
         this.idOperador = idOperador;
         this.nomeOperador = nomeOperador;
         this.senhaOperador = senhaOperador;
         this.urlOperador = urlOperador;
    }
    
    
    public int getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(int idOperador) {
        this.idOperador = idOperador;
    }

    public String getNomeOperador() {
        return nomeOperador;
    }

    public void setNomeOperador(String nomeOperador) {
        this.nomeOperador = nomeOperador;
    }

    public String getSenhaOperador() {
        return senhaOperador;
    }

    public void setSenhaOperador(String senhaOperador) {
        this.senhaOperador = senhaOperador;
    }

    public String getUrlOperador() {
        return urlOperador;
    }

    public void setUrlOperador(String urlOperador) {
        this.urlOperador = urlOperador;
    }
    
   
    @Override
    public String toString(){
        return idOperador+";"+nomeOperador+";"+senhaOperador+";"+urlOperador;
    }
    
}
