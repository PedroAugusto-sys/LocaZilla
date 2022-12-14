/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.control.modelo;

import com.LocaZilla.DAO.modelo.ModeloDAO;
import com.LocaZilla.model.modelo.Modelo;
import java.util.ArrayList;
import com.LocaZilla.DAO.modelo.IModeloDAO;
import java.io.File;
import java.util.Iterator;

/**
 *
 * @author pedro
 */
public class ModeloControle implements IModeloControle{
    
    
            IModeloDAO modeloPersistencia = null;
            
            public ModeloControle(){
                
            this.modeloPersistencia = new ModeloDAO();
       
            }
            
    private boolean buscarModelo (String descricao)throws Exception{
            try {
            ArrayList<Modelo> listagem = modeloPersistencia.listagem();
            Iterator<Modelo> lista = listagem.iterator();
            while(lista.hasNext()){
                 Modelo aux = lista.next();
                if(aux.getDescricao().equalsIgnoreCase(descricao)){
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
        }
    @Override
    public void incluirModelo(Modelo objeto) throws Exception {
       if(buscarModelo(objeto.getDescricao())){
            throw new Exception("Modelo já foi cadastrado.");
        }
       if(buscarModelo(objeto.getUrl())){
           throw new Exception("Foto já foi cadastrada.");
       }
        modeloPersistencia.incluir(objeto);
    }

    @Override
    public void alterarModelo(Modelo objeto) throws Exception {
            if(objeto.getDescricao().equals("") || objeto.getUrl().equals("")){
            throw new Exception("Preencha os campos corretamente.");
        }else{
            
        modeloPersistencia.alterar(objeto);
    
            }
    }

    @Override
    public ArrayList<Modelo> listagemModelo() throws Exception {
         return modeloPersistencia.listagem();
    }
    
    
    //EXCESSÕES==================
    
    @Override
    public void mesmaFoto(Modelo url)throws Exception{
        ArrayList<Modelo> lista = listagemModelo();
        
        for(int i = 0; i < lista.size(); i++){
            if(url.getUrl().equals(lista.get(i).getUrl())){
            throw new Exception("Modelo com esta foto já foi adicionado");
        }
            
        }
    }
    
     @Override
    public void semFoto(Modelo url)throws Exception{
            if(url.getUrl().equals("")){
                throw new Exception("Selecione a imagem do modelo para continuar");
        }

    }
    
    
     @Override
    public void vazio(Modelo desc) throws Exception {
        if(desc.getDescricao().equals("")){
             throw new Exception("Nenhum modelo sendo cadastrado");
        }
        
    }
    
        public void conferirBancoDeDados(){
        
        try {
            File bancodedados = new File("./src/com/LocaZilla/Dados/modelo/Modelo.txt");
            if(!bancodedados.exists()){
               
                bancodedados.createNewFile();
                
            }
        } catch (Exception e) {
        }
        
        
    }

    @Override
    public Modelo buscar(int id) throws Exception {
        return modeloPersistencia.buscar(id);
    }
    
}
