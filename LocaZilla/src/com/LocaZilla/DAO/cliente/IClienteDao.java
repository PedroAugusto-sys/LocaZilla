/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LocaZilla.DAO.cliente;
import com.LocaZilla.model.cliente.Cliente;
import java.util.ArrayList;


/**
 *
 * @author pedro
 */
public interface IClienteDao {
    
    void incluir(Cliente objeto) throws Exception;
    void alterar(Cliente objeto) throws Exception;
    ArrayList<Cliente> listagem() throws Exception;
    
    Cliente buscar(int id) throws Exception;
    Cliente buscar(String cpf_cnpj)throws Exception;
    
}
