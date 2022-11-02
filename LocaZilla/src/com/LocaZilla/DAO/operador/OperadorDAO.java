/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.DAO.operador;

import com.LocaZilla.Tools.geral.GeradorIdentificadorMarca;
import com.LocaZilla.model.operador.Operador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


/**
 *
 * @author pedro
 */
public class OperadorDAO implements IOperadorDAO{
    private String nomeDoArquivoNoDisco;
    public OperadorDAO() {
        nomeDoArquivoNoDisco = "./src/com/LocaZilla/Dados/operador/Operador.txt";
        
        //./src/com/locagyn/arquivosdedados/Marca.txt
    }
    
    @Override   
    public void incluirOperador(Operador objeto) throws Exception {
        try{
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
            //Criar o buffer do arquivo
            BufferedWriter bw =new BufferedWriter(fw);
            // Incluindo o id no objeto ******
            objeto.setIdOperador(GeradorIdentificadorMarca.getID());
            //Escreve no arquivo
            bw.write(objeto.toString()+"\n");
            //fecha o arquivo
            bw.close();		
      }catch(Exception erro){
         throw erro;
      }
    }

    @Override
    public void alterarOperador(Operador objeto) throws Exception {
        
        try{
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        String banco = "";
        while((linha = br.readLine()) != null){
            if(linha.contains(objeto.getIdOperador()+"")){
                banco+= objeto.getIdOperador()+ ";" + objeto.getNomeOperador()+ ";" + objeto.getSenhaOperador()+ ";"+
                        objeto.getUrlOperador()+"\n";
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
    public ArrayList<Operador> listagemOperador() throws Exception {
        try {
            ArrayList<Operador> listaDeOperador = new ArrayList<Operador>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                Operador objetoOperador = new Operador();
                String vetorString[] = linha.split(";");
                objetoOperador.setIdOperador(Integer.parseInt(vetorString[0]));
                objetoOperador.setNomeOperador(vetorString[1]);
                objetoOperador.setSenhaOperador(vetorString[2]);
                objetoOperador.setUrlOperador(vetorString[3]);
                
                
                listaDeOperador.add(objetoOperador);
            }
         br.close();
         return listaDeOperador;
        } catch(Exception erro){
         throw erro;
        }
    }
    
    
    @Override
    public void alterarSenhaOperador(Operador objeto) throws Exception{
        try {
             try{
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        String banco = "";
        while((linha = br.readLine()) != null){
            if(linha.contains(objeto.getSenhaOperador()+"")){
                banco+= objeto.getIdOperador()+ ";" + objeto.getNomeOperador()+ ";" + objeto.getUrlOperador()+ 
                        objeto.getSenhaOperador() +"\n";
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
        
        } catch (Exception e) {
        }
        
    }
}
