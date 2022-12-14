/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LocaZilla.DAO.modelo;

import com.LocaZilla.model.modelo.Modelo;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public interface IModeloDAO {
    void incluir(Modelo objeto)throws Exception;
    void alterar(Modelo objeto)throws Exception;
    ArrayList<Modelo> listagem()throws Exception;
    Modelo buscar (int id) throws Exception;
}
