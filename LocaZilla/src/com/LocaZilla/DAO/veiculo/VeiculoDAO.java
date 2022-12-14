/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.DAO.veiculo;

import com.LocaZilla.DAO.categoria.CategoriaDAO;
import com.LocaZilla.DAO.categoria.ICategoriaDAO;
import com.LocaZilla.Tools.geral.GeradorIdentificadorMarca;
import com.LocaZilla.model.veiculo.Veiculo;
import com.LocaZilla.DAO.modelo.IModeloDAO;
import com.LocaZilla.DAO.modelo.ModeloDAO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author hugo_
 */
public class VeiculoDAO implements IVeiculoDAO {

    private String nomeDoArquivoNoDisco;

    public VeiculoDAO() {
        nomeDoArquivoNoDisco = "./src/com/LocaZilla/Dados/veiculo/Veiculo.txt";

    }

    @Override
    public void incluir(Veiculo objeto) throws Exception {
        try {
            // cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            // Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            // Incluindo o id no objeto ******
            objeto.setId(GeradorIdentificadorMarca.getID());
            // Escreve no arquivo
            bw.write(objeto.toString() + "\n");
            // fecha o arquivo
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void alterar(Veiculo objeto) throws Exception {
        try {
            //Veiculo objetoVeiculo = new Veiculo();
            Iterator<Veiculo> lista = listagem().iterator();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            while (lista.hasNext()) {
                Veiculo aux = lista.next();
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
    public ArrayList<Veiculo> listagem() throws Exception {
        try {

            ArrayList<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
            File arquivo = new File("./src/com/locagyn/arquivosdedados/Modelo.txt");

            if (!arquivo.exists()) {
                arquivo.createNewFile();
                nomeDoArquivoNoDisco = "./src/com/locagyn/arquivosdedados/Modelo.txt";
            }

            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha;

            while ((linha = br.readLine()) != null) {

                IModeloDAO objetoModelo = new ModeloDAO();
                ICategoriaDAO objetoCategoria = new CategoriaDAO();

                Veiculo objVeiculo = new Veiculo();
                String vetorString[] = linha.split(";");

                objVeiculo.setId(Integer.parseInt(vetorString[0]));
                objVeiculo.setPlaca(vetorString[1]);
                objVeiculo.setRenavam(Integer.parseInt(vetorString[2]));
                objVeiculo.setPrecoDeCompra(Float.parseFloat(vetorString[3]));
                objVeiculo.setPrecoDeVenda(Float.parseFloat(vetorString[4]));
                objVeiculo.setAnoFabricacao(Integer.parseInt(vetorString[5]));
                objVeiculo.setAnoModelo(Integer.parseInt(vetorString[6]));
                objVeiculo.setTipoDeCombutivel(vetorString[7]);
                objVeiculo.setQuilometragem(Integer.parseInt(vetorString[8]));
                objVeiculo.setTipoDeVeiculo(vetorString[9]);
                int idModelo = Integer.parseInt(vetorString[10]);
                objVeiculo.setModelo(objetoModelo.buscar(idModelo));
                objVeiculo.setSituacao(vetorString[11]);
                int idCategoria = Integer.parseInt(vetorString[12]);
                objVeiculo.setCategoria(objetoCategoria.buscar(idCategoria));

                listaVeiculo.add(objVeiculo);

            }
            br.close();
            return listaVeiculo;
        } catch (Exception erro) {
            throw erro;

        }

    }

    @Override
    public Veiculo selecionarVeiculos(int id) throws Exception {
        
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        
        String linha = "";
        
        while ((linha = br.readLine()) != null) {
            
            IModeloDAO objetoModelo = new ModeloDAO();
            ICategoriaDAO objetoCategoria = new CategoriaDAO();
            Veiculo objetoVeiculo = new Veiculo();
            String vetorString[] = linha.split(";");
            System.out.printf(linha);
            objetoVeiculo.setId(Integer.parseInt(vetorString[0]));
            objetoVeiculo.setPlaca(vetorString[1]);
            objetoVeiculo.setRenavam(Integer.parseInt(vetorString[2]));
            objetoVeiculo.setPrecoDeCompra(Float.parseFloat(vetorString[3]));
            objetoVeiculo.setPrecoDeVenda(Float.parseFloat(vetorString[4]));
            objetoVeiculo.setAnoFabricacao(Integer.parseInt(vetorString[5]));
            objetoVeiculo.setAnoModelo(Integer.parseInt(vetorString[6]));
            objetoVeiculo.setTipoDeCombutivel(vetorString[7]);
            objetoVeiculo.setQuilometragem(Integer.parseInt(vetorString[8]));
            objetoVeiculo.setTipoDeVeiculo(vetorString[9]);
            objetoVeiculo.setSituacao(vetorString[11]);
            
            if (objetoVeiculo.getId() == id) {
                br.close();
                return new Veiculo(Integer.parseInt(vetorString[0]), vetorString[1], Integer.parseInt(vetorString[2]), Float.parseFloat(vetorString[3]), Float.parseFloat(vetorString[4]), Integer.parseInt(vetorString[5]), Integer.parseInt(vetorString[6]), vetorString[7], Integer.parseInt(vetorString[8]), vetorString[9], vetorString[11]);
            }
        }
        return null;
    }
    
}
