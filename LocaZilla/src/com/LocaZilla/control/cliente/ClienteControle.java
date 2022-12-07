/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.control.cliente;

import com.LocaZilla.model.cliente.Cliente;
import com.LocaZilla.model.cliente.TipoDoCliente;
import com.LocaZilla.DAO.cliente.ClienteDAO;
import com.LocaZilla.DAO.cliente.IClienteDAO;
import java.util.ArrayList;

/**
 *
 * @author Avell
 */
public class ClienteControle implements IClienteControle {

    IClienteDAO clientePersistencia = null;

    public ClienteControle() {
        this.clientePersistencia = new ClienteDAO();
    }
    
    
    
    @Override
    public void incluir(Cliente objeto, TipoDoCliente tipoDoCliente) throws Exception {
        clientePersistencia.incluir(objeto, tipoDoCliente);
    }

    @Override
    public void alterar(Cliente objeto, TipoDoCliente tipoDoCliente) throws Exception {
        clientePersistencia.alterar(objeto, tipoDoCliente);
    }

    @Override
    public ArrayList<Cliente> listagem(TipoDoCliente tipoDoCliente) throws Exception {
        return clientePersistencia.listagem(tipoDoCliente);
    }

    @Override
    public Cliente buscar(int id, TipoDoCliente tipoDoCliente) throws Exception {
        return clientePersistencia.buscar(id, tipoDoCliente);
    }

    @Override
    public void conferirTxt() throws Exception {
        clientePersistencia.conferirTxt();
    }
    
}
