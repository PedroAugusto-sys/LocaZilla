/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.Tools.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author pedro
 */
public class GeradorIdentificardorModelo {
     public static void criarArquivoDeIDModelo()throws FileNotFoundException, IOException{
        String nomeDoArquivo ="./src/com/LocaZilla/Dados/modelo/idModelo.txt";
         FileWriter fw = new FileWriter(nomeDoArquivo);
        BufferedWriter bw =new BufferedWriter(fw);
        //Escreve no arquivo
        String saida = 1+"";
        bw.write(saida);
        //fecha o arquivo
        bw.close();	
    }
    public static int getIDModelo()throws FileNotFoundException, IOException{
        String nomeDoArquivo ="./src/com/LocaZilla/Dados/modelo/idModelo.txt";
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br  = new BufferedReader(fr);
        String linha=br.readLine();
        int id = Integer.parseInt(linha);
        br.close();
        id++;
        //cria o arquivo
        FileWriter fw = new FileWriter(nomeDoArquivo);
        //Criar o buffer do arquivo
        BufferedWriter bw =new BufferedWriter(fw);
        //Escreve no arquivo
        String saida = id+"";
        bw.write(saida);
        //fecha o arquivo
        bw.close();	
        return id;
    }  
}
