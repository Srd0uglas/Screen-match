package br.com.alura.screenmatch.modelos;
//a classe Série vai herdar os atributos da classe titulo e só vamos acrescentar os atributos necessários para a Série
public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;


//    Construtor é para deifinir um atributo como padrão
    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    //    ALT+INSERT = GET E SETTERS
//    ESSE MÉTODO É PARA RETORNAR O VALOR QUE FOI DEFINIDO NO ATRINUTO
    public int getTemporadas() {
        return temporadas;
    }
    //    ESSE MÉTODO É PARA ACESSAR O VALOR QUE FOI DEFINIDO NO ATRINUTO
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

//    Sobrecrever um Método = estou pegando a classe mãe e colocando outros valores nela
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Série: "+ this.getNome() +" ("+ this.getAnoDeLancamento() +")";
    }
}

