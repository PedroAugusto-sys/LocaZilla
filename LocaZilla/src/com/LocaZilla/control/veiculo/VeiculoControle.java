/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.control.veiculo;

import com.LocaZilla.DAO.veiculo.IVeiculoDAO;
import com.LocaZilla.DAO.veiculo.VeiculoDAO;
import com.LocaZilla.model.veiculo.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class VeiculoControle implements IVeiculoControle {

    IVeiculoDAO veiculoPersistencia = null;

    public VeiculoControle() {
        this.veiculoPersistencia = new VeiculoDAO();
    }

    @Override
    public void incluir(Veiculo objeto) throws Exception {
        veiculoPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Veiculo objeto) throws Exception {
        veiculoPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Veiculo> listagem() throws Exception {
        return veiculoPersistencia.listagem();
    }

    @Override
    public Veiculo selecionarVeiculos(int id) throws Exception {
        return veiculoPersistencia.selecionarVeiculos(id);
    }



}
