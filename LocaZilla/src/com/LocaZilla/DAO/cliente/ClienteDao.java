/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.DAO.cliente;

import com.LocaZilla.Tools.geral.GeradorIdentificadorMarca;
import com.LocaZilla.model.cliente.Cliente;
//import com.LocaZilla.model.cliente.Cliente.TipoCliente;
import com.LocaZilla.model.cliente.TipoCliente;
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

    Endereco objetoEndereco = new Endereco();
    Telefone objetoTelefone = new Telefone();

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
                            + objetoTelefone.getDdi() + ";" + objetoTelefone.getDdd() + ";" + objetoTelefone.getNumero() + ";"
                            + objeto.getEmail() + ";" + objetoEndereco.getBairro() + ";" + objetoEndereco.getCidade() + ";"
                            + objetoEndereco.getComplemento() + ";" + objetoEndereco.getEstado() + ";" + objetoEndereco.getLogradouro() + ";"
                            + objetoEndereco.getCep() + ";" + objeto.getIdentidade() + ";" + objeto.getTipoCliente() + "\n";
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
                String vetorString[] = linha.split(";");
                objetoCliente.setId(Integer.parseInt(vetorString[0]));
                objetoCliente.setNome(vetorString[1]);
                objetoCliente.setRazaoSocial(vetorString[2]);
                objetoCliente.setCpf_cnpj(vetorString[3]);
                Telefone telefone = new Telefone();
                telefone.setDdi(Integer.parseInt(vetorString[4]));
                telefone.setDdd(Integer.parseInt(vetorString[5]));
                telefone.setNumero(Integer.parseInt(vetorString[6]));
                //objetoCliente.setTelefone((Telefone) vetorString[4]);
                objetoCliente.setEmail((String) vetorString[7]);
                Endereco endereco = new Endereco();
                endereco.setBairro(vetorString[8]);
                endereco.setCidade(vetorString[9]);
                endereco.setComplemento(vetorString[10]);
                endereco.setEstado(vetorString[11]);
                endereco.setLogradouro(vetorString[12]);
                endereco.setCep(Integer.parseInt(vetorString[13]));
                //objetoCliente.setEndereco((Endereco) vetorString[6]);

                if (vetorString[14].equals(TipoCliente.PESSOA_FISICA)) {
                    objetoCliente.setTipo(TipoCliente.PESSOA_FISICA);
                } else {
                    objetoCliente.setTipo(TipoCliente.PESSOA_JURIDICA);

                }

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
            String vetorString[] = linha.split(";");
            objetoCliente.setId(Integer.parseInt(vetorString[0]));
            objetoCliente.setNome(vetorString[1]);
            objetoCliente.setRazaoSocial(vetorString[2]);
            objetoCliente.setCpf_cnpj(vetorString[3]);
            Telefone telefone = new Telefone();
            telefone.setDdi(Integer.parseInt(vetorString[4]));
            telefone.setDdd(Integer.parseInt(vetorString[5]));
            telefone.setNumero(Integer.parseInt(vetorString[6]));
            //objetoCliente.setTelefone((Telefone) vetorString[4]);
            objetoCliente.setEmail((String) vetorString[7]);
            Endereco endereco = new Endereco();
            endereco.setBairro(vetorString[8]);
            endereco.setCidade(vetorString[9]);
            endereco.setComplemento(vetorString[10]);
            endereco.setEstado(vetorString[11]);
            endereco.setLogradouro(vetorString[12]);
            endereco.setCep(Integer.parseInt(vetorString[13]));
            //objetoCliente.setEndereco((Endereco) vetorString[6]);

            if (vetorString[14].equals(TipoCliente.PESSOA_FISICA)) {
                objetoCliente.setTipo(TipoCliente.PESSOA_FISICA);
            } else {
                objetoCliente.setTipo(TipoCliente.PESSOA_JURIDICA);

            }

            if (objetoCliente.getId() == id) {
                br.close();

                return objetoCliente;
            }

        }
        return null;

    }

    @Override
    public Cliente buscar(String cpf_cnpj) throws Exception {

        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while ((linha = br.readLine()) != null) {
            Cliente objetoCliente = new Cliente();
            String vetorString[] = linha.split(";");
            objetoCliente.setId(Integer.parseInt(vetorString[0]));
            objetoCliente.setNome(vetorString[1]);
            objetoCliente.setRazaoSocial(vetorString[2]);
            objetoCliente.setCpf_cnpj(vetorString[3]);
            Telefone telefone = new Telefone();
            telefone.setDdi(Integer.parseInt(vetorString[4]));
            telefone.setDdd(Integer.parseInt(vetorString[5]));
            telefone.setNumero(Integer.parseInt(vetorString[6]));
            //objetoCliente.setTelefone((Telefone) vetorString[4]);
            objetoCliente.setEmail((String) vetorString[7]);
            Endereco endereco = new Endereco();
            endereco.setBairro(vetorString[8]);
            endereco.setCidade(vetorString[9]);
            endereco.setComplemento(vetorString[10]);
            endereco.setEstado(vetorString[11]);
            endereco.setLogradouro(vetorString[12]);
            endereco.setCep(Integer.parseInt(vetorString[13]));
            //objetoCliente.setEndereco((Endereco) vetorString[6]);

            if (vetorString[14].equals(TipoCliente.PESSOA_FISICA)) {
                objetoCliente.setTipo(TipoCliente.PESSOA_FISICA);
            } else {
                objetoCliente.setTipo(TipoCliente.PESSOA_JURIDICA);

            }

            if (objetoCliente.getCpf_cnpj().equals(cpf_cnpj)) {
                br.close();

                return objetoCliente;
            }

        }
        return null;

    }
}
