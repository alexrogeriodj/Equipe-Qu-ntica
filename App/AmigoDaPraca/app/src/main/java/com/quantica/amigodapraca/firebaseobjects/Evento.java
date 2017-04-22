package com.quantica.amigodapraca.firebaseobjects;

/**
 * Created by andre on 22/04/2017.
 */

public class Evento {
    private String nome;
    private String data;
    private String descricao;

    public void setNome(String s) {
        nome = s;
    }

    public void setData(String s) {
        data = s;
    }

    public void setDescricao(String s) {
        descricao = s;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

}
