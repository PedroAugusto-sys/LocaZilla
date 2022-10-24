/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.DAO.marca;


import com.LocaZilla.model.marca.Marca;
import java.util.ArrayList;


/**
 *
 * @author pedro
 */
public interface IMarcaDAO {
    void incluir(Marca objeto)throws Exception;
    void alterar(Marca objeto)throws Exception;
    ArrayList<Marca> listagem()throws Exception;
    Marca buscar(int id)throws Exception;
}
