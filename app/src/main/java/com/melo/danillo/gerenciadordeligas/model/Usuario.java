package com.melo.danillo.gerenciadordeligas.model;

/**
 * Created by Danillo on 04/08/2017.
 */

public class Usuario {

   private  String nome ;
    private String email;
    private String senha;
    private String sexo;

    private Club club;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
