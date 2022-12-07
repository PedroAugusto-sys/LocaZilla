/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LocaZilla.DAO.veiculo;

import com.LocaZilla.model.veiculo.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author hugo_
 */
public interface IVeiculoDAO {
    
    void incluir(Veiculo objeto) throws Exception;
    void alterar(Veiculo objeto) throws Exception;
    ArrayList<Veiculo> listagem() throws Exception;
    String selecionarVeiculos(int id) throws Exception;
    
}
