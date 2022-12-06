/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.DAO.cliente;

import com.LocaZilla.DAO.marca.MarcaDAO;
import com.LocaZilla.Tools.geral.GeradorIdentificadorMarca;
import com.LocaZilla.model.cliente.Cliente;
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
                Cliente objCliente = new Cliente();
                ClienteDAO objeto  = new ClienteDAO();
                Object banco[]= linha.split(";");
                objCliente.setId(Integer.parseInt((String) banco[0]));
                //objCliente.setTipoDoCliente(objeto.buscarEndTel(linha, linha) banco[1]);
                objCliente.setCpf_cnpj((String) banco[2]);
                objCliente.setNome((String) banco[3]);
                //NOME e RAZAO SOCIAL ficam no mesmo jtext
                objCliente.setIdentidade((String) banco[4]);
                objCliente.setEmail((String) banco[5]);
                //objCliente.setTelefone((String) banco[6]);
                //objCliente.setEndereco((String) banco[7]);
                
                listaClientes.add(objCliente);
                
                //USADO NA MARCA
                // chamar o metodo busca da marca
                //objCliente.setMarca(objeto.buscar(idMarca));
                
            }
         br.close();
         return listaClientes; 
        } catch (Exception erro) {
            throw erro;
        }
    }

}
