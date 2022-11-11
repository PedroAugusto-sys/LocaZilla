/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LocaZilla.model.cliente;

/**
 *
 * @author pedro
 */
public class Cliente implements Comparable<Cliente>{

    private int id;
    private String cpf_cnpj;
    private String nome;
    private String razaoSocial;
    private String identidade;
    private Telefone telefone;
    private String email;
    private Endereco endereco;
    private TipoCliente tipo;
    
    //Constructor
    public Cliente(int id, String cpf_cnpj, String nome, String razaoSocial, String identidade, Telefone telefone, String email, TipoCliente tipo, Endereco endereco) {
        this.id = id;
        this.cpf_cnpj = cpf_cnpj;
        this.nome = nome;
        this.razaoSocial = razaoSocial;
        this.identidade = identidade;
        this.telefone = telefone;
        this.email = email;
        this.tipo = tipo;
        this.endereco = endereco;
    }
    
    public Cliente(){
        
    }
    
    
    //Getters + Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString(){
        return id+";"+nome+";"+razaoSocial+";"+cpf_cnpj+";"+telefone+";"+email+";"+endereco+";"+identidade+";"+tipo;
    }
    
    @Override
    public int compareTo(Cliente id ) {
        if(this.id == id.getId()) return(this.id++);
        else  return(this.id - id.getId());

    }
    
    public enum TipoCliente {
        PESSOA_FISICA, PESSOA_JURIDICA
    }

    
    
}
