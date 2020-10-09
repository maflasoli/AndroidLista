package com.example.lista;

public class Item {
    private String rmAluno, nomeAluno, endAluno, fotoAluno;

    public Item(String rm, String nome, String endereco, String foto){

        this.rmAluno=rm;
        this.nomeAluno=nome;
        this.endAluno=endereco;
        this.fotoAluno=foto;


    }

    public String getRmAluno() {
        return rmAluno;
    }

    public void setRmAluno(String rmAluno) {
        this.rmAluno = rmAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEndAluno() {
        return endAluno;
    }

    public void setEndAluno(String endAluno) {
        this.endAluno = endAluno;
    }

    public String getFotoAluno() {
        return fotoAluno;
    }

    public void setFotoAluno(String fotoAluno) {
        this.fotoAluno = fotoAluno;
    }
}
