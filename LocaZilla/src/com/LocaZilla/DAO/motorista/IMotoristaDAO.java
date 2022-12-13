/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LocaZilla.DAO.motorista;

import com.LocaZilla.model.motorista.Motorista;
import java.util.ArrayList;

/**
 *
 * @author Avell
 */
public interface IMotoristaDAO {
    
    void incluir(Motorista objeto) throws Exception;

    void alterar(Motorista objeto) throws Exception;

    ArrayList<Motorista> listagem() throws Exception;

    Motorista buscar(int id) throws Exception;

}
