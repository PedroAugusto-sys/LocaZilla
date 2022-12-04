/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.DAO.marca;

import com.LocaZilla.Tools.geral.GeradorIdentificadorMarca;
import com.LocaZilla.model.marca.Marca;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class MarcaDAO implements IMarcaDAO{
    private String nomeDoArquivoNoDisco;
    private String nomeDoArquivoIDNoDisco;
    public MarcaDAO() {
        nomeDoArquivoNoDisco = "./src/com/LocaZilla/Dados/marca/Marca.txt";
        nomeDoArquivoIDNoDisco = "./src/com/LocaZilla/Dados/marca/idGerado.txt";
        
        //./src/com/locagyn/arquivosdedados/Marca.txt
    }
    
    @Override
    public void incluir(Marca objeto) throws Exception {
        try{
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
      }catch(Exception erro){
         throw erro;
      }
    }

    @Override
    public void alterar(Marca objeto) throws Exception {
        
        try{
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        String banco = "";
        while((linha = br.readLine()) != null){
            if(linha.contains(objeto.getId()+"")){
                banco+= objeto.getId() + ";" + objeto.getDescricao() + ";" + objeto.getUrl() + "\n";
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
    public ArrayList<Marca> listagem() throws Exception {
        try {
            ArrayList<Marca> listaDeMarcas = new ArrayList<Marca>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                Marca objetoMarca = new Marca();
                String vetorString[] = linha.split(";");
                objetoMarca.setId(Integer.parseInt(vetorString[0]));
                objetoMarca.setDescricao(vetorString[1]);
                objetoMarca.setUrl(vetorString[2]);
                listaDeMarcas.add(objetoMarca);
            }
         br.close();
         return listaDeMarcas;
        } catch(Exception erro){
         throw erro;
        }
    }
    
    @Override
    public Marca buscar(int id) throws Exception{
        
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
           // ArrayList<Marca> lista = listagem();
            String linha = "";
            while((linha = br.readLine()) !=null ){
                Marca objetoMarca = new Marca();
                String vetorString[] = linha.split(";");
                objetoMarca.setId(Integer.parseInt(vetorString[0]));
                objetoMarca.setDescricao(vetorString[1]);
                objetoMarca.setUrl(vetorString[2]);
              
                if(objetoMarca.getId() == id){
                br.close();
                return new Marca(Integer.parseInt(vetorString[0]),vetorString[1], vetorString[2]);
                }
                
            }
            return null;
            
    }
    
    @Override
    public Marca buscar (String descricao) throws Exception{
       
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
           // ArrayList<Marca> lista = listagem();
            String linha = "";
            while((linha = br.readLine()) !=null ){
                Marca objetoMarca = new Marca();
                String vetorString[] = linha.split(";");
                objetoMarca.setId(Integer.parseInt(vetorString[0]));
                objetoMarca.setDescricao(vetorString[1]);
                objetoMarca.setUrl(vetorString[2]);
              
                if(objetoMarca.getDescricao()== descricao){
                br.close();
                return new Marca(Integer.parseInt(vetorString[0]),vetorString[1], vetorString[2]);
                }
                
            }
            return null;
            
       
    }
   

    

    
}
