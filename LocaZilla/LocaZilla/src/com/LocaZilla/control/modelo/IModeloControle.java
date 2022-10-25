/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LocaZilla.control.modelo;

import com.LocaZilla.model.modelo.Modelo;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public interface IModeloControle {
     void incluirModelo(Modelo objeto)throws Exception;
    void alterarModelo(Modelo objeto)throws Exception;
    ArrayList<Modelo> listagemModelo()throws Exception;
    
    
    //Excessões
    void vazio (Modelo desc)throws Exception;
    void semFoto(Modelo url)throws Exception;
    void mesmaFoto(Modelo url)throws Exception;
    
}
