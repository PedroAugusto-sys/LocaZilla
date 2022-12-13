/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.control.motorista;

import com.LocaZilla.model.motorista.Motorista;
import java.util.ArrayList;
import com.LocaZilla.DAO.motorista.MotoristaDAO;
import com.LocaZilla.DAO.motorista.IMotoristaDAO;

/**
 *
 * @author Avell
 */
public class MotoristaControle implements IMotoristaControle {
    
    IMotoristaDAO motoristaPersistencia = null;
    
    public MotoristaControle() {
        this.motoristaPersistencia = new MotoristaDAO();
    }
    
    @Override
    public void incluir(Motorista objeto) throws Exception {
        motoristaPersistencia.incluir(objeto);
    }
    
    @Override
    public void alterar(Motorista objeto) throws Exception {
        motoristaPersistencia.alterar(objeto);
    }
    
    @Override
    public ArrayList<Motorista> listagem() throws Exception {
        return motoristaPersistencia.listagem();
    }
    
    @Override
    public Motorista buscar(int id) throws Exception {
        return motoristaPersistencia.buscar(id);
    }
    
}
