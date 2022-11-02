/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.DAO.modelo;

import com.LocaZilla.DAO.marca.MarcaDAO;
import com.LocaZilla.Tools.geral.GeradorIdentificadorMarca;
import com.LocaZilla.model.marca.Marca;
import com.LocaZilla.model.modelo.Modelo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
/**
 *
 * @author pedro
 */
public class ModeloDAO implements IModeloDAO {
    
    private String nomeDoArquivoNoDisco;
    
    public ModeloDAO() {
        nomeDoArquivoNoDisco = "./src/com/LocaZilla/Dados/modelo/Modelo.txt";
        
       
    }
    @Override   
    public void incluir(Modelo objeto) throws Exception {
        try{
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
            //Criar o buffer do arquivo
            BufferedWriter bw =new BufferedWriter(fw);
            // Incluindo o id no objeto ******
            objeto.setIdModelo(GeradorIdentificadorMarca.getID());
            //Escreve no arquivo
            bw.write(objeto.toString()+"\n");
            //fecha o arquivo
            bw.close();		
      }catch(Exception erro){
         throw erro;
      }
    }

    @Override
    public void alterar(Modelo objeto) throws Exception {
        
        try{
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        String banco = "";
        while((linha = br.readLine()) != null){
            if(linha.contains(objeto.getIdModelo()+"")){
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
    public ArrayList<Modelo> listagem() throws Exception {
         ArrayList<Modelo> listaModelos = new ArrayList<Modelo>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
             while((linha=br.readLine())!=null){
                Modelo objetoModelo = new Modelo();
                MarcaDAO objeto  = new MarcaDAO();
                Object banco[]= linha.split(";");
                objetoModelo.setIdModelo(Integer.parseInt((String) banco[0]));
                objetoModelo.setDescricao((String) banco[1]);
                objetoModelo.setUrl((String) banco[2]);
                int idMarca = Integer.parseInt((String)banco[3]);
                // chamar o metodo busca da marca
                objetoModelo.setMarca(objeto.buscar(idMarca));
                listaModelos.add(objetoModelo);
            }
         br.close();
         return listaModelos; 
    }
   
}
