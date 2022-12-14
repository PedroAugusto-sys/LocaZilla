/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.DAO.categoria;

import com.LocaZilla.Tools.geral.GeradorIdentificadorMarca;
import com.LocaZilla.model.veiculo.Categoria;
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
public class CategoriaDAO implements ICategoriaDAO {

    private String nomeDoArquivoNoDisco;

    public CategoriaDAO() {
        nomeDoArquivoNoDisco = "./src/com/LocaZilla/Dados/categoria/Categoria.txt";
    }

    @Override
    public void incluir(Categoria objeto) throws Exception {
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
    public void alterar(Categoria objeto) throws Exception {

        try {
            Categoria objetoCategoria = new Categoria();
            Iterator<Categoria> lista = listagem().iterator();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            while (lista.hasNext()) {
                Categoria aux = lista.next();
                if (aux.getId() == objeto.getId()) {
                    bw.write(objeto.toString() + "\n");

                } else {
                    bw.write(aux.toString() + "\n");
                }
            }
            bw.close();

        } catch (Exception e) {
        }
    }

    @Override
    public ArrayList<Categoria> listagem() throws Exception {

        try {
            ArrayList<Categoria> listaDeCategoria = new ArrayList<Categoria>();
            File arquivo = new File("./src/com/LocaZilla/Dados/categoria/Categoria.txt");
            if (!arquivo.exists()) {
                arquivo.createNewFile();
                nomeDoArquivoNoDisco = "./src/com/LocaZilla/Dados/categoria/Categoria.txt";
            }
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";

            while ((linha = br.readLine()) != null) {
                Categoria objetoCategoria = new Categoria();
                String vetorString[] = linha.split(";");
                objetoCategoria.setId(Integer.parseInt(vetorString[0]));
                objetoCategoria.setDescricao(vetorString[1]);
                objetoCategoria.setValorDaLocacao(Float.parseFloat(vetorString[2]));
                listaDeCategoria.add(objetoCategoria);
            }
            br.close();
            return listaDeCategoria;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public Categoria buscar(int id) throws Exception {
        
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        
        String linha = "";
        
        while ((linha = br.readLine()) != null) {
            
            Categoria objetoCategoria = new Categoria();
            String vetorString[] = linha.split(";");
            objetoCategoria.setId(Integer.parseInt(vetorString[0]));
            objetoCategoria.setDescricao(vetorString[1]);
            objetoCategoria.setValorDaLocacao(Float.parseFloat(vetorString[2]));
            
            if (objetoCategoria.getId() == id) {
                br.close();
                
                return new Categoria((Integer.parseInt(vetorString[0])), vetorString[1], Float.parseFloat(vetorString[2]));
            }
        }
        return null;
    }
}


