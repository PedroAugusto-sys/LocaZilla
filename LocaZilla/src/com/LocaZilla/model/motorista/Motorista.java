/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.model.motorista;

import com.LocaZilla.model.cliente.Endereco;
import com.LocaZilla.model.cliente.Telefone;
import java.util.Date;

/**
 *
 * @author Avell
 */
public class Motorista {

    private int id;
    private String nome;
    private String url;
    private long numeroCNH;
    private String categoriaCNH;
    private String dataVencimento;
    private Telefone telefone;
    private Endereco endereco;

    public Motorista() {
    }

    public Motorista(int id, String nome, String url, long numeroCNH, String categoriaCNH, String dataVencimento, Telefone telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.url = url;
        this.numeroCNH = numeroCNH;
        this.categoriaCNH = categoriaCNH;
        this.dataVencimento = dataVencimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Motorista(int id, String nome, String url, long numeroCNH, String categoriaCNH, String dataVencimento) {
        this.id = id;
        this.nome = nome;
        this.url = url;
        this.numeroCNH = numeroCNH;
        this.categoriaCNH = categoriaCNH;
        this.dataVencimento = dataVencimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(long numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    public String getCategoriaCNH() {
        return categoriaCNH;
    }

    public void setCategoriaCNH(String categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return id + ";"
                + nome + ";"
                + url + ";"
                + numeroCNH + ";"
                + categoriaCNH + ";"
                + dataVencimento + ";"
                + telefone.toString() + ";"
                + endereco.toString();
    }

}
