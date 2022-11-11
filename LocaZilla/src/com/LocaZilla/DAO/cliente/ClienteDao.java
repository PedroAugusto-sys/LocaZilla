/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.DAO.cliente;

import com.LocaZilla.Tools.geral.GeradorIdentificadorMarca;
import com.LocaZilla.model.cliente.Cliente;
import com.LocaZilla.model.cliente.Cliente.TipoCliente;
import com.LocaZilla.model.cliente.Endereco;
import com.LocaZilla.model.cliente.Telefone;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class ClienteDao implements IClienteDao {

    private String nomeDoArquivoNoDisco;

    public ClienteDao() {
        nomeDoArquivoNoDisco = "./src/com/LocaZilla/Dados/cliente/Cliente.txt";
    }

    @Override
    public void incluir(Cliente objeto) throws Exception {
        try {
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            // Incluindo o id no objeto ******
            objeto.setId(GeradorIdentificadorMarca.getID());
            //Escreve no arquivo
            bw.write(objeto.toString() + "\n");
            //fecha o arquivo
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void alterar(Cliente objeto) throws Exception {

        try {
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            String banco = "";
            while ((linha = br.readLine()) != null) {
                if (linha.contains(objeto.getId() + "")) {
                    banco += objeto.getId() + ";" + objeto.getNome() + ";" + objeto.getRazaoSocial() + ";" + objeto.getCpf_cnpj() + ";"
                            + objeto.getTelefone() + ";" + objeto.getEmail() + ";" + objeto.getEndereco() + ";" + objeto.getIdentidade() + ";" + objeto.getTipo() + "\n";
                } else {
                    banco += linha + "\n";
                }
            }
            br.close();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(banco);
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }

    }

    @Override
    public ArrayList<Cliente> listagem() throws Exception {
        try {
            ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {

                Cliente objetoCliente = new Cliente();
                Object vetorString[] = linha.split(";");
                objetoCliente.setId(Integer.parseInt((String) vetorString[0]));
                objetoCliente.setNome((String) vetorString[1]);
                objetoCliente.setCpf_cnpj((String) vetorString[2]);
                objetoCliente.setRazaoSocial((String) vetorString[3]);
                objetoCliente.setTelefone((Telefone) vetorString[4]);
                objetoCliente.setEmail((String) vetorString[5]);
                objetoCliente.setEndereco((Endereco) vetorString[6]);
                objetoCliente.setIdentidade((String) vetorString[7]);
                objetoCliente.setTipo(((Cliente.TipoCliente) vetorString[8]));
                listaDeClientes.add(objetoCliente);

            }
            br.close();
            return listaDeClientes;
        } catch (Exception erro) {
            throw erro;

        }
    }

    @Override
    public Cliente buscar(int id) throws Exception {
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while ((linha = br.readLine()) != null) {
            Cliente objetoCliente = new Cliente();
            Object vetorString[] = linha.split(";");
            objetoCliente.setId(Integer.parseInt((String) vetorString[0]));
            objetoCliente.setNome((String) vetorString[1]);
            objetoCliente.setCpf_cnpj((String) vetorString[2]);
            objetoCliente.setRazaoSocial((String) vetorString[3]);
            objetoCliente.setTelefone((Telefone) vetorString[4]);
            objetoCliente.setEmail((String) vetorString[5]);
            objetoCliente.setEndereco((Endereco) vetorString[6]);
            objetoCliente.setIdentidade((String) vetorString[7]);
            objetoCliente.setTipo(((Cliente.TipoCliente) vetorString[8]));

            if (objetoCliente.getId() == id) {
                br.close();

                return new Cliente();
            }

        }
        return null;

    }

    @Override
    public Cliente buscar(String cpf_cnpj) throws Exception {

        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        // ArrayList<Marca> lista = listagem();
        String linha = "";
        while ((linha = br.readLine()) != null) {
            Cliente objetoCliente = new Cliente();
            Object vetorString[] = linha.split(";");
            objetoCliente.setId(Integer.parseInt((String) vetorString[0]));
            objetoCliente.setNome((String) vetorString[1]);
            objetoCliente.setCpf_cnpj((String) vetorString[2]);
            objetoCliente.setRazaoSocial((String) vetorString[3]);
            objetoCliente.setTelefone((Telefone) vetorString[4]);
            objetoCliente.setEmail((String) vetorString[5]);
            objetoCliente.setEndereco((Endereco) vetorString[6]);
            objetoCliente.setIdentidade((String) vetorString[7]);
            objetoCliente.setTipo(((Cliente.TipoCliente) vetorString[8]));
            if (objetoCliente.getCpf_cnpj().equals(cpf_cnpj)) {
                br.close();
                return new Cliente();
            }

        }
        return null;

    }
}
