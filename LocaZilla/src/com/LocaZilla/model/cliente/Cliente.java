/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.model.cliente;

/**
 *
 * @author pedro
 */
public class Cliente {

    private int id;
    private String nome;
    private String cpf_cnpj;
    private String email;
    private String razaoSocial;
    private String identidade;
    private Telefone telefone;
    private Endereco endereco;
    private TipoDoCliente tipoDoCliente;

    
    
    
    //Metodos
    public Cliente(int id, String nome, String cpf_cnpj, String email, String razaoSocial, String identidade, Telefone telefone, Endereco endereco, TipoDoCliente tipoDoCliente) {
        this.id = id;
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.email = email;
        this.razaoSocial = razaoSocial;
        this.identidade = identidade;
        this.telefone = telefone;
        this.endereco = endereco;
        this.tipoDoCliente = tipoDoCliente;
    }

    public Cliente() {

    }

    //Gets+Sets    
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

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
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

    public TipoDoCliente getTipoDoCliente() {
        return tipoDoCliente;
    }

    public void setTipoDoCliente(TipoDoCliente tipoDoCliente) {
        this.tipoDoCliente = tipoDoCliente;
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + cpf_cnpj + ";" + email + ";" + razaoSocial + ";" + identidade + ";" + telefone + ";" + endereco + ";" + tipoDoCliente;
    }

}
