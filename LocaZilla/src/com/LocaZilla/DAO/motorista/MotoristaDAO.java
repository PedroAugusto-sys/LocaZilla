/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.DAO.motorista;

import com.LocaZilla.Tools.geral.GeradorIdentificadorMarca;
import com.LocaZilla.model.cliente.Endereco;
import com.LocaZilla.model.cliente.Telefone;
import com.LocaZilla.model.motorista.Motorista;
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
public class MotoristaDAO implements IMotoristaDAO {

    private String nomeDoArquivoNoDisco;
    Motorista objetoMotorista = new Motorista();

    public MotoristaDAO() {

        nomeDoArquivoNoDisco = "./src/com/LocaZilla/Dados/motorista/Motorista.txt";
    }

    @Override
    public void incluir(Motorista objeto) throws Exception {
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
    public void alterar(Motorista objeto) throws Exception {
        try {

            Iterator<Motorista> lista = listagem().iterator();

            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            while (lista.hasNext()) {
                Motorista aux = lista.next();

                if (aux.getId() == objeto.getId()) {
                    bw.write(objeto.toString() + "\n");
                } else {
                    bw.write(aux.toString() + "\n");
                }
            }
            bw.close();

        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public ArrayList<Motorista> listagem() throws Exception {
        try {
            ArrayList<Motorista> listaMotorista = new ArrayList<Motorista>();
            String linha = "";

            File arquivo = new File("./src/com/LocaZilla/Dados/motorista/Motorista.txt");
            if (!arquivo.exists()) {
                arquivo.createNewFile();
                nomeDoArquivoNoDisco = "./src/com/LocaZilla/Dados/motorista/Motorista.txt";
            }

            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            while ((linha = br.readLine()) != null) {
                Motorista objMotorista = new Motorista();

                String vetorString[] = linha.split(";");

                objMotorista.setId(Integer.parseInt(vetorString[0]));
                objMotorista.setNome(vetorString[1]);
                objMotorista.setUrl(vetorString[2]);
                objMotorista.setNumeroCNH(Long.parseLong(vetorString[3]));
                objMotorista.setCategoriaCNH(vetorString[4]);
                objMotorista.setDataVencimento(vetorString[5]);

                int ddi = Integer.parseInt(vetorString[6]);
                int ddd = Integer.parseInt(vetorString[7]);
                int numero = Integer.parseInt(vetorString[8]);
                Telefone telefone = new Telefone(ddi, ddd, numero);
                objMotorista.setTelefone(telefone);

                String logradouro = vetorString[9];
                String complemento = vetorString[10];
                int cep = Integer.parseInt(vetorString[11]);
                String bairro = vetorString[12];
                String cidade = vetorString[13];
                String estado = vetorString[14];
                Endereco endereco = new Endereco(logradouro, complemento, cep, bairro, cidade, estado);

                objMotorista.setEndereco(endereco);
                listaMotorista.add(objMotorista);

            }
            br.close();
            return listaMotorista;
        } catch (Exception erro) {
            throw erro;
        }

    }

    @Override
    public Motorista buscar(int id) throws Exception {
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while ((linha = br.readLine()) != null) {

            Motorista objMotorista = new Motorista();

            String vetorString[] = linha.split(";");
            objMotorista.setId(Integer.parseInt(vetorString[0]));
            objMotorista.setNome(vetorString[1]);
            objMotorista.setUrl(vetorString[2]);
            objMotorista.setNumeroCNH(Long.parseLong(vetorString[3]));
            objMotorista.setCategoriaCNH(vetorString[4]);
            objMotorista.setDataVencimento(vetorString[5]);

            int ddi = Integer.parseInt(vetorString[6]);
            int ddd = Integer.parseInt(vetorString[7]);
            int numero = Integer.parseInt(vetorString[8]);
            Telefone telefone = new Telefone(ddi, ddd, numero);
            objMotorista.setTelefone(telefone);

            String logradouro = vetorString[9];
            String complemento = vetorString[10];
            int cep = Integer.parseInt(vetorString[11]);
            String bairro = vetorString[12];
            String cidade = vetorString[13];
            String estado = vetorString[14];
            Endereco endereco = new Endereco(logradouro, complemento, cep, bairro, cidade, estado);

            if (objetoMotorista.getId() == id) {
                br.close();
                return new Motorista(Integer.parseInt(vetorString[0]), vetorString[1],
                        vetorString[2], Long.parseLong(vetorString[3]), vetorString[4], vetorString[5], telefone, endereco);
            }
        }
        return null;

    }
}
