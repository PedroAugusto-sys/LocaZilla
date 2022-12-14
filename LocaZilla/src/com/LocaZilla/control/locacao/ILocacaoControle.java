/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LocaZilla.control.locacao;

import com.LocaZilla.model.locacao.Locacao;
import java.util.ArrayList;

/**
 *
 * @author Avell
 */
public interface ILocacaoControle {

    void locar(Locacao objeto) throws Exception;

    void devolver(Locacao objeto) throws Exception;

    ArrayList<Locacao> listagem() throws Exception;

}
