/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.LocaZilla.control.cliente;

import com.LocaZilla.model.cliente.Cliente;
import com.LocaZilla.model.cliente.TipoDoCliente;
import java.util.ArrayList;

/**
 *
 * @author Avell
 */
public interface IClienteControle {
    
    void incluir (Cliente objeto, TipoDoCliente tipoDoCliente) throws Exception;
    void alterar (Cliente objeto, TipoDoCliente tipoDoCliente) throws Exception;
    ArrayList<Cliente> listagem(TipoDoCliente tipoDoCliente) throws Exception;
    Cliente buscar(int id, TipoDoCliente tipoDoCliente) throws Exception;
    public void conferirTxt() throws Exception;
}
