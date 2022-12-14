/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.DAO.locacao;

import com.LocaZilla.DAO.motorista.IMotoristaDAO;
import com.LocaZilla.DAO.veiculo.IVeiculoDAO;
import com.LocaZilla.Tools.geral.GeradorIdentificadorMarca;
import com.LocaZilla.model.locacao.Locacao;
import com.LocaZilla.model.locacao.SituacaoDaLocacao;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import com.LocaZilla.model.acessorios.Acessorios;
import com.LocaZilla.DAO.motorista.MotoristaDAO;
import com.LocaZilla.DAO.veiculo.VeiculoDAO;

/**
 *
 * @author pedro
 */
public class LocacaoDAO implements ILocacaoDAO {

    private String nomeDoArquivoNoDiscoLOCACAO;
    Locacao objetoLocacao = new Locacao();

    public LocacaoDAO() {
        nomeDoArquivoNoDiscoLOCACAO = "./src/com/LocaZilla/Dados/locacao/Locacao.txt";
    }

    @Override
    public void incluir(Locacao objeto, SituacaoDaLocacao situacaoDaLocacao) throws Exception {
            try {
                    //cria o arquivo
                    FileWriter fw = new FileWriter(nomeDoArquivoNoDiscoLOCACAO, true);
                    //Criar o buffer do arquivo
                    BufferedWriter bw = new BufferedWriter(fw);
                    // Incluindo o id no objeto ******
                    objeto.setId(GeradorIdentificadorMarca.getID());
                    //Escreve no arquivo
                    bw.write(objeto.toString(objeto.getSituacaoDaLocacao()) + "\n");
                    //fecha o arquivo
                    bw.close();
            } catch (Exception erro) {
                throw erro;
            }

        }

        @Override
        public void devolver(Locacao objeto, SituacaoDaLocacao situacaoDaLocacao) throws Exception {
            try {
          
                
                } catch (Exception e) {
                }
        }

        @Override
        public ArrayList<Locacao> listagem(SituacaoDaLocacao situacaoDaLocacao) throws Exception {
            try {
            ArrayList<Locacao> listaDeLocacao = new ArrayList<Locacao>();
            File arquivo = new File("./src/com/LocaZilla/Dados/locacao/Locacao.txt");
            if (!arquivo.exists()) {
                arquivo.createNewFile();
                nomeDoArquivoNoDiscoLOCACAO = "./src/com/LocaZilla/Dados/locacao/Locacao.txt";
            }
            FileReader fr = new FileReader(nomeDoArquivoNoDiscoLOCACAO);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                IVeiculoDAO objetoVeiculo = new VeiculoDAO();
                IMotoristaDAO objetoMotorista = new MotoristaDAO();
                IAcessoriosDao objetoAcessorio = new AcessoriosDao();
                Locacao objetoLocacao = new Locacao();
                String vetorString[] = linha.split(";");
                objetoLocacao.setId(Integer.parseInt(vetorString[0]));
                int idMotorista = Integer.parseInt(vetorString[2]);
                objetoLocacao.setMotorista(objetoMotorista.buscar(idMotorista));
                int idVeiculo = Integer.parseInt(vetorString[3]);
                objetoLocacao.setVeiculo(objetoVeiculo.buscar(idVeiculo));
                int idAcessorios = Integer.parseInt(vetorString[4]);
                objetoLocacao.setAcessorio(objetoAcessorio.buscar(idAcessorios));
                objetoLocacao.setDataInicio(vetorString[5]);
                objetoLocacao.setDataFim(vetorString[6]);
                objetoLocacao.setValorDaLocacao(Float.parseFloat(vetorString[7]));
                objetoLocacao.setSituacaoDaLocacao(situacaoDaLocacao);
                
                
                listaDeLocacao.add(objetoLocacao);

            }
            br.close();
            return listaDeLocacao;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public Locacao buscar(int id, SituacaoDaLocacao situacaoDaLocacao) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void conferirTxt() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        }

    
    