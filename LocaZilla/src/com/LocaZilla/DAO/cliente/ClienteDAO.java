/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.DAO.cliente;

import com.LocaZilla.DAO.marca.MarcaDAO;
import com.LocaZilla.Tools.geral.GeradorIdentificadorMarca;
import com.LocaZilla.model.cliente.Cliente;
import com.LocaZilla.model.cliente.Endereco;
import com.LocaZilla.model.cliente.Telefone;
import com.LocaZilla.model.cliente.TipoDoCliente;
import com.LocaZilla.model.modelo.Modelo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Avell
 */
public class ClienteDAO implements IClienteDAO {
    private String nomeDoArquivoNoDisco;
    public ClienteDAO() {
        nomeDoArquivoNoDisco = "./src/com/LocaZilla/Dados/cliente/Cliente.txt";
}

    @Override
    public void incluir(Cliente objeto) throws Exception {
        try {
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
            //Criar o buffer do arquivo
            BufferedWriter bw =new BufferedWriter(fw);
            // Incluindo o id no objeto ******
            objeto.setId(GeradorIdentificadorMarca.getID());
            //Escreve no arquivo
            bw.write(objeto.toString()+"\n");
            //fecha o arquivo
            bw.close();	
            
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void alterar(Cliente objeto) throws Exception {
        
        try{
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        String banco = "";
        while((linha = br.readLine()) != null){
            if(linha.contains(objeto.getId()+"")){
                banco+= objeto.toString()+"\n";
            }else{
                banco+= linha + "\n";
            }
        }
        br.close();
        FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
        BufferedWriter bw  = new BufferedWriter(fw);
        bw.write(banco);
        bw.close();       
        }catch(Exception erro){
         throw erro;
      }
    }

    @Override
    public ArrayList<Cliente> listagem() throws Exception {
        try {
            ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
             while((linha=br.readLine())!=null){
             Cliente objetoCliente = new Cliente();
                    
                    String vetorString[] = linha.split(";");
                    objetoCliente.setId(Integer.parseInt(vetorString[0]));
                    objetoCliente.setCpf_cnpj(vetorString[1]);
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
                    String bairro = vetorString[10];
                    String cidade = vetorString[11];
                    String estado = vetorString[12];
                    int cep = Integer.parseInt(vetorString[13]);

                    Endereco endereco = new Endereco(logradouro, complemento, cep, bairro, cidade, estado);
                    objetoCliente.setEndereco(endereco);
                    listaClientes.add(objetoCliente);
            }
         br.close();
         return listaClientes; 
        } catch (Exception erro) {
            throw erro;
        }
    }

}
