/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.control.cliente;

import com.LocaZilla.DAO.cliente.IClienteDao;
import com.LocaZilla.DAO.cliente.ClienteDao;
import com.LocaZilla.model.cliente.Cliente;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author pedro
 */
public class ClienteControle implements IClienteControle {

    IClienteDao clientePersistencia = null;

    public ClienteControle() {
        this.clientePersistencia = new ClienteDao();
    }

    private boolean buscarCliente(String cpf_cnpj) throws Exception {
        try {
            ArrayList<Cliente> listagem = clientePersistencia.listagem();
            Iterator<Cliente> lista = listagem.iterator();

            while (lista.hasNext()) {
                
                    Cliente aux = lista.next();

                    if (aux.getCpf_cnpj().equalsIgnoreCase(cpf_cnpj)) {
                        return true;
                    }
            }
            return false;
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    
//    @Override
    public void incluirCliente(Cliente objetoCliente) throws Exception{
//        if(objetoCliente.getCpf_cnpj().equals("") || objetoCliente.getEmail().equals("") || objetoCliente.getEndereco().equals("") || objetoCliente.getId() = 0 || objetoCliente.getNome().equals("") ){
            
        }
        
        
        
//    private int id;
//    private String cpf_cnpj;
//    private String nome;
//    private String razaoSocial;
//    private String identidade;
//    private Telefone telefone;
//    private String email;
//    private Endereco endereco;
//    private TipoCliente tipo;
        
        
}
    


       
