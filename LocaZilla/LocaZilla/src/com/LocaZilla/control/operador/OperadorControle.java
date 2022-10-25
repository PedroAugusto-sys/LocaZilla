/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.control.operador;

import com.LocaZilla.DAO.operador.IOperadorDAO;
import com.LocaZilla.DAO.operador.OperadorDAO;
import com.LocaZilla.model.operador.Operador;
import java.util.ArrayList;
import java.util.Iterator;



/**
 *
 * @author pedro
 */
public class OperadorControle implements IOperadorControle {
    
    IOperadorDAO operadorPersistencia = null;
    
    public OperadorControle(){
        
        this.operadorPersistencia = new OperadorDAO();
   
    }
    
    private boolean buscarOperador(String nome)throws Exception{
        try {
            ArrayList<Operador> listagem = operadorPersistencia.listagemOperador();
            Iterator<Operador> lista = listagem.iterator();
            while(lista.hasNext()){
                 Operador aux = lista.next();
                if(aux.getNomeOperador().equalsIgnoreCase(nome)){
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    private boolean buscarFotoOperador(String url) throws Exception{
        try{
            ArrayList<Operador> listagem = operadorPersistencia.listagemOperador();
            Iterator<Operador> lista = listagem.iterator();
            while (lista.hasNext()) {
                  Operador aux = lista.next();
                if(aux.getUrlOperador().equalsIgnoreCase(url)){
                    return true;
                }
            }
            return false;
        } catch (Exception erro){
            throw erro;
        }
    }
        
        private boolean verificarVazio(Operador objeto){
        if(objeto.getNomeOperador().equals("")) {
            return true;
        }
        else{if(objeto.getSenhaOperador().equals("")) {
            return true;
        }
            return false;
        }
    }
        
    @Override
    public void incluirOperador(Operador objeto) throws Exception {
        if(verificarVazio(objeto)) {
            throw new Exception("Preencha os campos corretamente");
        }
            
        if(buscarOperador(objeto.getNomeOperador())){
            throw new Exception("Operador já foi cadastrado");
        }
        operadorPersistencia.incluirOperador(objeto);
    }
    
    
    @Override
    public void alterarOperador(Operador objeto) throws Exception {
        if(verificarVazio(objeto)) {
            throw new Exception("Preencha os campos corretamente");
        }
        operadorPersistencia.alterarOperador(objeto);    
    }
    
    
    
    @Override
    public ArrayList<Operador> listagemOperador() throws Exception {
         return operadorPersistencia.listagemOperador();
        }
    
    @Override
    public void alterarSenhaOperador(Operador objeto) throws Exception{
        if(verificarVazio(objeto)) {
            throw new Exception("Preencha os campos corretamente");
        }
            
        if(buscarOperador(objeto.getNomeOperador())){
            throw new Exception("Operador já foi cadastrado");
        }
        operadorPersistencia.incluirOperador(objeto);
    
    }
    
}
