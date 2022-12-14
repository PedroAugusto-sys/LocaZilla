/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.DAO.locacao;


import com.LocaZilla.DAO.motorista.IMotoristaDAO;
import com.LocaZilla.DAO.motorista.IMotoristaDAO;
import com.LocaZilla.DAO.veiculo.IVeiculoDAO;
import com.LocaZilla.DAO.veiculo.VeiculoDAO;
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
 * @author Avell
 */
public class LocacaoDAO implements ILocacaoDAO {

    private String nomeDoArquivoNoDiscoLOCACAO;
    Locacao objetoLocacao = new Locacao();

    public LocacaoDAO() {
        nomeDoArquivoNoDiscoLOCACAO = "./src/com/LocaZilla/Dados/locacao/Locacao.txt";
    }

    @Override
    public void incluir(Locacao objeto) throws Exception {
        try {
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDiscoLOCACAO, true);
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
    public void devolver(Locacao objeto) throws Exception {
        try {

        } catch (Exception e) {
        }
    }

    @Override
    public ArrayList<Locacao> listagem() throws Exception {
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

                Locacao objetoLocacao = new Locacao();
                String vetorString[] = linha.split(";");

                objetoLocacao.setId(Integer.parseInt(vetorString[0]));
                int idMotorista = Integer.parseInt(vetorString[1]);
                objetoLocacao.setMotorista(objetoMotorista.buscar(idMotorista));
                int idVeiculo = Integer.parseInt(vetorString[2]);
                objetoLocacao.setVeiculo(objetoVeiculo.selecionarVeiculos(idVeiculo));
                objetoLocacao.setDuracao(Integer.parseInt(vetorString[3]));
                objetoLocacao.setValorDaLocação(Float.parseFloat(vetorString[4]));
                objetoLocacao.setSituacao(vetorString[5]);

                listaDeLocacao.add(objetoLocacao);

            }
            br.close();
            return listaDeLocacao;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public Locacao buscar(int id) throws Exception {
//        FileReader fr = new FileReader(nomeDoArquivoNoDiscoLOCACAO);
//        BufferedReader br = new BufferedReader(fr);
//        String linha;
//        while ((linha = br.readLine()) != null) {
//            
//            IVeiculoDAO objVeiculo = new VeiculoDAO();
//            IMotoristaDAO objMotorista = new MotoristaDAO();
//            
//            Locacao objLocacao = new Locacao();
//            
//            String vetorString[] = linha.split(";");
//            objetoLocacao.setId(Integer.parseInt(vetorString[0]));
//            int idMotorista = Integer.parseInt(vetorString[1]);
//            objetoLocacao.setMotorista(objMotorista.buscar(idMotorista));
//            int idVeiculo = Integer.parseInt(vetorString[2]);
//            objetoLocacao.setVeiculo(objVeiculo.selecionarVeiculos(idVeiculo));
//            objLocacao.setDuracao(Integer.parseInt(vetorString[3]));
//            objLocacao.setValorDaLocação(Float.parseFloat(vetorString[4]));
//            objLocacao.setSituacao(vetorString[5]);
//            
//            if (objLocacao.getId() == id) {
//                br.close();
//                return new Locacao(Integer.parseInt(vetorString[0]), 
//                        cliente, motorista, veiculo, Float.MAX_VALUE, objLocacao, idVeiculo);
                
//                        this.id = id;
//        this.cliente = cliente;
//        this.motorista = motorista;
//        this.veiculo = veiculo;
//        this.valorDaLocação = valorDaLocação;
//        this.situacao = situacao;
////        this.duracao = duracao;
//            }
//        }
        return null;
    }

    @Override
    public void conferirTxt() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
