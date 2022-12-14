/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.DAO.cliente;

import com.LocaZilla.Tools.geral.GeradorIdentificadorMarca;
import com.LocaZilla.model.cliente.Cliente;
import com.LocaZilla.model.cliente.Endereco;
import com.LocaZilla.model.cliente.Telefone;
import com.LocaZilla.model.cliente.TipoDoCliente;
import static com.LocaZilla.model.cliente.TipoDoCliente.PESSOA_FISICA;
import static com.LocaZilla.model.cliente.TipoDoCliente.PESSOA_JURIDICA;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Avell
 */
public class ClienteDAO implements IClienteDAO {

    private String nomeDoArquivoNoDiscoPF;
    private String nomeDoArquivoNoDiscoPJ;
    private String caminho = "";
    Cliente objetoCliente = new Cliente();

    public ClienteDAO() {

        nomeDoArquivoNoDiscoPF = "./src/com/LocaZilla/Dados/cliente/ClientePF.txt";
        nomeDoArquivoNoDiscoPJ = "./src/com/LocaZilla/Dados/cliente/ClientePJ.txt";
    }

    @Override
    public void incluir(Cliente objeto, TipoDoCliente tipoDoCliente) throws Exception {

        try {
            if (tipoDoCliente.equals(TipoDoCliente.PESSOA_FISICA)) {
                //cria o arquivo
                FileWriter fw = new FileWriter(nomeDoArquivoNoDiscoPF, true);
                //Criar o buffer do arquivo
                BufferedWriter bw = new BufferedWriter(fw);
                // Incluindo o id no objeto ******
                objeto.setId(GeradorIdentificadorMarca.getID());
                //Escreve no arquivo
                bw.write(objeto.toString(objeto.getTipoDoCliente()) + "\n");
                //fecha o arquivo
                bw.close();
            }
            if (tipoDoCliente.equals(TipoDoCliente.PESSOA_JURIDICA)) {
                //cria o arquivo
                FileWriter fw = new FileWriter(nomeDoArquivoNoDiscoPJ, true);
                //Criar o buffer do arquivo
                BufferedWriter bw = new BufferedWriter(fw);
                // Incluindo o id no objeto ******
                objeto.setId(GeradorIdentificadorMarca.getID());
                //Escreve no arquivo
                bw.write(objeto.toString(objeto.getTipoDoCliente()) + "\n");
                //fecha o arquivo
                bw.close();
            }

        } catch (Exception erro) {
            throw erro;
        }

    }

    @Override
    public void alterar(Cliente objeto, TipoDoCliente tipoDoCliente) throws Exception {

        try {
            Iterator<Cliente> lista = listagem(objeto.getTipoDoCliente()).iterator();

            if (tipoDoCliente.equals(TipoDoCliente.PESSOA_FISICA)) {
                FileWriter fw = new FileWriter(nomeDoArquivoNoDiscoPF);
                BufferedWriter bw = new BufferedWriter(fw);

                while (lista.hasNext()) {
                    Cliente aux = lista.next();

                    if (aux.getId() == objeto.getId()) {
                        bw.write(objeto.toString() + "\n");
                    } else {
                        bw.write(aux.toString() + "\n");
                    }
                }
                bw.close();
            }

            if (tipoDoCliente.equals(TipoDoCliente.PESSOA_JURIDICA)) {
                FileWriter fw = new FileWriter(nomeDoArquivoNoDiscoPJ);
                BufferedWriter bw = new BufferedWriter(fw);

                while (lista.hasNext()) {
                    Cliente aux = lista.next();

                    if (aux.getId() == objeto.getId()) {
                        bw.write(objeto.toString() + "\n");
                    } else {
                        bw.write(aux.toString() + "\n");
                    }
                }
                bw.close();
            }

        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public ArrayList<Cliente> listagem(TipoDoCliente tipoDoCliente) throws Exception {
        try {
            ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
            String linha = "";

            if (tipoDoCliente.equals(TipoDoCliente.PESSOA_FISICA)) {
                FileReader fr = new FileReader(nomeDoArquivoNoDiscoPF);
                BufferedReader br = new BufferedReader(fr);

                while ((linha = br.readLine()) != null) {
                    Cliente objetoCliente = new Cliente();

                    String vetorString[] = linha.split(";");
                    objetoCliente.setId(Integer.parseInt(vetorString[0]));
                    objetoCliente.setCpf(vetorString[1]);
                    objetoCliente.setNome(vetorString[2]);
                    objetoCliente.setIdentidade(vetorString[3]);

                    int ddi = Integer.parseInt(vetorString[4]);
                    int ddd = Integer.parseInt(vetorString[5]);
                    int numero = Integer.parseInt(vetorString[6]);
                    Telefone telefone = new Telefone(ddi, ddd, numero);
                    objetoCliente.setTelefone(telefone);
                    objetoCliente.setEmail(vetorString[7]);

                    String logradouro = vetorString[8];
                    String complemento = vetorString[9];
                    int cep = Integer.parseInt(vetorString[10]);
                    String bairro = vetorString[11];
                    String cidade = vetorString[12];
                    String estado = vetorString[13];

                    Endereco endereco = new Endereco(logradouro, complemento, cep, bairro, cidade, estado);
                    objetoCliente.setEndereco(endereco);
                    listaClientes.add(objetoCliente);
                }
                br.close();
                return listaClientes;
            }

            if (tipoDoCliente.equals(TipoDoCliente.PESSOA_JURIDICA)) {
                FileReader fr = new FileReader(nomeDoArquivoNoDiscoPJ);
                BufferedReader br = new BufferedReader(fr);

                while ((linha = br.readLine()) != null) {
                    Cliente objetoCliente = new Cliente();

                    String vetorString[] = linha.split(";");
                    objetoCliente.setId(Integer.parseInt(vetorString[0]));
                    objetoCliente.setRazaoSocial(vetorString[1]);
                    objetoCliente.setCnpj(vetorString[2]);

                    int ddi = Integer.parseInt(vetorString[3]);
                    int ddd = Integer.parseInt(vetorString[4]);
                    int numero = Integer.parseInt(vetorString[5]);
                    Telefone telefone = new Telefone(ddi, ddd, numero);
                    objetoCliente.setTelefone(telefone);
                    objetoCliente.setEmail(vetorString[6]);

                    String logradouro = vetorString[7];
                    String complemento = vetorString[8];
                    int cep = Integer.parseInt(vetorString[9]);
                    String bairro = vetorString[10];
                    String cidade = vetorString[11];
                    String estado = vetorString[12];

                    Endereco endereco = new Endereco(logradouro, complemento, cep, bairro, cidade, estado);
                    objetoCliente.setEndereco(endereco);
                    listaClientes.add(objetoCliente);

                }
                br.close();
                return listaClientes;
            }
            return null;

        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public Cliente buscar(int id, TipoDoCliente tipoDoCliente) throws Exception {

        if (tipoDoCliente == PESSOA_FISICA) {

            FileReader fr = new FileReader(nomeDoArquivoNoDiscoPF);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {

                String vetorString[] = linha.split(";");
                objetoCliente.setId(Integer.parseInt(vetorString[0]));
                objetoCliente.setNome(vetorString[1].replaceAll("_", " "));
                objetoCliente.setCpf(vetorString[2]);
                objetoCliente.setIdentidade(vetorString[3]);

                int ddi = Integer.parseInt(vetorString[4]);
                int ddd = Integer.parseInt(vetorString[5]);
                int numero = Integer.parseInt(vetorString[6]);
                Telefone telefone = new Telefone(ddi, ddd, numero);
                objetoCliente.setTelefone(telefone);

                objetoCliente.setEmail(vetorString[7]);

                String logradouro = vetorString[8];
                String complemento = vetorString[9];
                int cep = Integer.parseInt(vetorString[10]);
                String bairro = vetorString[11];
                String cidade = vetorString[12];
                String estado = vetorString[13];
                Endereco endereco = new Endereco(logradouro, complemento, cep, bairro, cidade, estado);
                objetoCliente.setEndereco(endereco);

                if (objetoCliente.getId() == id) {
                    br.close();
                    return new Cliente((Integer.parseInt(vetorString[0])), vetorString[1], vetorString[2], vetorString[3], vetorString[7], telefone, endereco, tipoDoCliente);
                }
            }
        }
        if (tipoDoCliente == PESSOA_JURIDICA) {
            FileReader fr = new FileReader(nomeDoArquivoNoDiscoPJ);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";

            while ((linha = br.readLine()) != null) {

                String vetorString[] = linha.split(";");
                objetoCliente.setId(Integer.parseInt(vetorString[0]));
                objetoCliente.setRazaoSocial(vetorString[1]);
                objetoCliente.setCnpj(vetorString[2]);

                String[] telSeparado = vetorString[3].split(";");
                int ddi = Integer.parseInt(telSeparado[0]);
                int ddd = Integer.parseInt(telSeparado[1]);
                int numero = Integer.parseInt(telSeparado[2]);
                Telefone telefone = new Telefone(ddi, ddd, numero);
                objetoCliente.setTelefone(telefone);

                objetoCliente.setEmail(vetorString[4]);

                String[] endSeparado = vetorString[5].split(",");
                String logradouro = endSeparado[0];
                String complemento = endSeparado[1];
                int cep = Integer.parseInt(endSeparado[2]);
                String bairro = endSeparado[3];
                String cidade = endSeparado[4];
                String estado = endSeparado[5];
                Endereco endereco = new Endereco(logradouro, complemento, cep, bairro, cidade, estado);
                objetoCliente.setEndereco(endereco);

                if (objetoCliente.getId() == id) {
                    br.close();
                    return new Cliente((Integer.parseInt(vetorString[0])), vetorString[2], vetorString[1], vetorString[4], telefone, endereco, tipoDoCliente);
                }
            }

        }
        return null;

    }

    @Override
    public void conferirTxt() throws Exception {

        File arquivoPf = new File("./src/com/LocaZilla/Dados/cliente/ClientePF.txt");
        File arquivoPj = new File("./src/com/LocaZilla/Dados/cliente/ClientePJ.txt");

        try {

            arquivoPf.createNewFile();
            arquivoPj.createNewFile();

        } catch (Exception e) {

            System.out.println("Erro ao criar o arquivo");
        }

    }

}
