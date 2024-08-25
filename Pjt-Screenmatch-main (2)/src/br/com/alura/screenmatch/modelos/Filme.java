package br.com.alura.screenmatch.modelos;

import calculos.Classificavel;

//A classe vai TITULO especificar tudo que o filme tem (características)
//extends filme tem tudo que o título tem
public class Filme extends Titulo implements Classificavel {
  private String diretor;

//    Criação de um construtor
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
//    representa a classificação em estrelas
    @Override
    public int getClassificacao() {
//            casting
        return (int) pegaMedia()/2;
    }

//    Sobrescrever o toString para mudar o comportamento (todo mundo tem)

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "("+ this.getAnoDeLancamento() + ")";
    }
}
