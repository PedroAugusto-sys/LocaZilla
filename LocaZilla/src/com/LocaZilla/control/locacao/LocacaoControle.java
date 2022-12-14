/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.control.locacao;

import com.LocaZilla.DAO.locacao.ILocacaoDAO;
import com.LocaZilla.DAO.locacao.LocacaoDAO;
import com.LocaZilla.model.locacao.Locacao;
import java.util.ArrayList;

/**
 *
 * @author Avell
 */
public class LocacaoControle implements ILocacaoControle {

    ILocacaoDAO locacaoPersistencia = new LocacaoDAO();

    @Override
    public void locar(Locacao objeto) throws Exception {
        locacaoPersistencia.incluir(objeto);
    }

    @Override
    public void devolver(Locacao objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Locacao> listagem() throws Exception {
        return locacaoPersistencia.listagem();
    }

}


