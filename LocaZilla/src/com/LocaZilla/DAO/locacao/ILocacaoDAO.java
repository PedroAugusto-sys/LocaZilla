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
 * @author pedro
 */
public interface ILocacaoDAO {
    void incluir (Locacao objeto, SituacaoDaLocacao situacaoDaLocacao) throws Exception;
    void devolver (Locacao objeto, SituacaoDaLocacao situacaoDaLocacao) throws Exception;
    ArrayList<Locacao> listagem(SituacaoDaLocacao situacaoDaLocacao) throws Exception;
    Locacao  buscar(int id, SituacaoDaLocacao situacaoDaLocacao) throws Exception;
    public void conferirTxt() throws Exception;

}
