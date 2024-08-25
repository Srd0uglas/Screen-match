package br.com.alura.screenmatch.modelos;

import calculos.Classificavel;

public class Episodio implements Classificavel {
//    todo ep tem um nº e um nome
    private int numero;
    private String nome;
    private Serie serie;
    private int totalDeVisualizacoes;

    public int getTotalDeVisualizacoes() {
        return totalDeVisualizacoes;
    }

    public void setTotalDeVisualizacoes(int totalDeVisualizacoes) {
        this.totalDeVisualizacoes = totalDeVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
//        se as visualizações passarem de 100
        if(totalDeVisualizacoes > 100){
            return 4;
        }else{
            return 2;
        }
    }
}

