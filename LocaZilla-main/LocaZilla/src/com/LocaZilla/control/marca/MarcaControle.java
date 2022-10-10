/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.control.marca;

import com.LocaZilla.DAO.marca.IMarcaDAO;
import com.LocaZilla.DAO.marca.MarcaDAO;
import com.LocaZilla.model.marca.Marca;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pedro
 */
public class MarcaControle implements IMarcaControle {
     IMarcaDAO marcaPersistencia = null;
    public MarcaControle(){
        this.marcaPersistencia = new MarcaDAO();
    }
    
    private boolean buscarMarca(String descricao)throws Exception{
        try {
            ArrayList<Marca> listagem = marcaPersistencia.listagem();
            Iterator<Marca> lista = listagem.iterator();
            while(lista.hasNext()){
                 Marca aux = lista.next();
                if(aux.getDescricao().equalsIgnoreCase(descricao)){
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    private boolean buscarLogo(String url) throws Exception{
        try{
            ArrayList<Marca> listagem = marcaPersistencia.listagem();
            Iterator<Marca> lista = listagem.iterator();
            while (lista.hasNext()) {
                  Marca aux = lista.next();
                if(aux.getUrl().equalsIgnoreCase(url)){
                    return true;
                }
            }
            return false;
        } catch (Exception erro){
            throw erro;
        }
    }
        
        private boolean verificarVazio(Marca objeto){
        if(objeto.getDescricao().equals("") || objeto.getUrl().equals("")) return true;
        return false;
    }
    
    @Override
    public void incluir(Marca objeto) throws Exception {
        if(verificarVazio(objeto)) 
            throw new Exception("Preencha os campos corretamente");
        if(buscarMarca(objeto.getDescricao())){
            throw new Exception("Marca já foi cadastrada");
        }
        marcaPersistencia.incluir(objeto);
    }
    @Override
    public void alterar(Marca objeto) throws Exception {
         if (buscarMarca(objeto.getDescricao())) {
            throw new Exception("Marca já foi cadastrada");
        }
        marcaPersistencia.alterar(objeto);    
    }
    @Override
    public ArrayList<Marca> listagem() throws Exception {
         return marcaPersistencia.listagem();
        }
}

        
        


