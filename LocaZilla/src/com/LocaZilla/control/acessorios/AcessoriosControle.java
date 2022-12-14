/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.control.acessorios;

import com.LocaZilla.model.acessorios.Acessorios;
import com.LocaZilla.DAO.acessorios.AcessoriosDAO;
import com.LocaZilla.DAO.acessorios.IAcessoriosDAO;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Avell
 */
public class AcessoriosControle implements IAcessoriosControle {
    IAcessoriosDAO acessoriosPersistencia = null;

    public AcessoriosControle() {
        this.acessoriosPersistencia = new AcessoriosDAO();
    }

    private boolean buscarAcessorios (String descricao) throws Exception {
      try {
            ArrayList<Acessorios> listagem = acessoriosPersistencia.listagem();
            Iterator<Acessorios> lista = listagem.iterator();
            while (lista.hasNext()) {
                Acessorios aux = lista.next();
                if (aux.getDescricao().equalsIgnoreCase(descricao)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
          throw erro;
        }
    }

    @Override
    public void incluir(Acessorios objeto) throws Exception {
        if (buscarAcessorios(objeto.getDescricao())) {
            throw new Exception("Acessorio já foi cadastrado");
        }

        if ("".equals(objeto.getDescricao().replace(" ", ""))) {
            throw new Exception("Digite a Descrição");
        }

       if (objeto.getValorDaLocacao()==0) {
           throw new Exception("Digite o Valor da Locação");
        }

        acessoriosPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Acessorios objeto) throws Exception {

        if ("".equals(objeto.getDescricao().replace(" ", ""))) {
            throw new Exception("Digite a Descrição");
        }

        acessoriosPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Acessorios> listagem() throws Exception {
        return acessoriosPersistencia.listagem(); 
    }

    @Override
    public Acessorios buscar(int id) throws Exception {
        return acessoriosPersistencia.buscar(id);
    }

    
}