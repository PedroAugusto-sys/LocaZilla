/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LocaZilla.DAO.locacao;

import com.LocaZilla.model.locacao.Locacao;
import com.LocaZilla.model.locacao.SituacaoDaLocacao;
import java.util.ArrayList;

/**
 *
 * @author Avell
 */
public interface ILocacaoDAO {

    void incluir(Locacao objeto) throws Exception;

    void devolver(Locacao objeto) throws Exception;

    ArrayList<Locacao> listagem() throws Exception;

    Locacao buscar(int id) throws Exception;

    public void conferirTxt() throws Exception;

}
