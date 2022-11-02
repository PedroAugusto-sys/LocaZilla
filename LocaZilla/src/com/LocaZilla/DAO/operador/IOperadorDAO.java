/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LocaZilla.DAO.operador;

import com.LocaZilla.model.operador.Operador;
import java.util.ArrayList;
/**
 *
 * @author pedro
 */
public interface IOperadorDAO {
    
    void incluirOperador(Operador objeto) throws Exception;
    void alterarOperador(Operador objeto) throws Exception;
    ArrayList<Operador> listagemOperador()  throws Exception; 
    void alterarSenhaOperador(Operador objeto) throws Exception;
}
