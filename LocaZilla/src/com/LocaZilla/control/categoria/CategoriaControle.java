/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.control.categoria;

import com.LocaZilla.DAO.categoria.CategoriaDAO;
import com.LocaZilla.DAO.categoria.ICategoriaDAO;
import com.LocaZilla.model.veiculo.Categoria;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Avell
 */
public class CategoriaControle implements ICategoriaControle {

    ICategoriaDAO categoriaPersistencia = null;

    public CategoriaControle() {

        this.categoriaPersistencia = new CategoriaDAO();

    }

    @Override
    public void incluir(Categoria objeto) throws Exception {
        categoriaPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Categoria objeto) throws Exception {
        categoriaPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Categoria> listagem() throws Exception {
        return categoriaPersistencia.listagem();
    }

    @Override
    public Categoria buscar(int id) throws Exception {
        return categoriaPersistencia.buscar(id);
    }

    private boolean buscarCategoria(String descricao) throws Exception {
        try {
            ArrayList<Categoria> listagem = categoriaPersistencia.listagem();
            Iterator<Categoria> lista = listagem.iterator();
            while (lista.hasNext()) {
                Categoria aux = lista.next();
                if (aux.getDescricao().equalsIgnoreCase(descricao)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }

}
