/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LocaZilla.DAO.acessorios;

import com.LocaZilla.model.acessorios.Acessorios;
import java.util.ArrayList;

/**
 *
 * @author Avell
 */
public interface IAcessoriosDAO {

    void incluir(Acessorios objeto) throws Exception;

    void alterar(Acessorios objeto) throws Exception;

    ArrayList<Acessorios> listagem() throws Exception;

    Acessorios buscar(int id) throws Exception;

}
