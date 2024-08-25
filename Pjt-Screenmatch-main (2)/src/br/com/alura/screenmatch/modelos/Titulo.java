package br.com.alura.screenmatch.modelos;
//a classe titulo é uma classe geral
//e a classe Filme e série tem os atributos parecidos, então vao HERDAR esses atributos da classe titulo
//Essa classe é uma herança = atributos em comum

//***ESSA CLASSE É A QUE GUARDA O QUE TODAS AS CLASSES TEM EM COMUM***
public class Titulo  implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    //       Método acessor
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
//    Método para deixar a pessoa incluir um nome
//    String nome é so um parametro

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //    Método = vai imprimir a ficha técnica do filme
    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    //    Método para somar as avaliações
//    a variável avaliação está declarada como double, então preciso passar um parâmetro double para o método
//    "nota" é o parâmetro
    public void avalia(double nota){
        somaDasAvaliacoes = somaDasAvaliacoes + nota;
//        a cada avaliação feita o método vai incrementar (adicionar mais 1)
        totalDeAvaliacoes++;
    }

    //  Método para mostrar a média
    public double pegaMedia(){
//        return é para retornar um valor
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }


    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
