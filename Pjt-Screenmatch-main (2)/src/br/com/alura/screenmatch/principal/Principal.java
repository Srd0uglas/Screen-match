package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
//  Instância da Classe br.com.alura.screenmatch.modelos.Filme
       Filme meuFilme = new Filme( "As vantagens de ser Invisível",2010);
//       meuFilme.setAnoDeLancamento(2010);
       meuFilme.setDuracaoEmMinutos(180);
       System.out.println("Duração em Minutos: "+ meuFilme.getDuracaoEmMinutos());
//     Quando eu chamar o método exibeFichaTecnica ele precisa exibir o que eu determinei
       meuFilme.exibeFichaTecnica();
       meuFilme.avalia(8);
       meuFilme.avalia(10);
       meuFilme.avalia(5);
       System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
       System.out.println(meuFilme.pegaMedia());
//*******************************************************************************************
       Serie serie = new Serie("Lost",2018);
       serie.exibeFichaTecnica();
       serie.setTemporadas(10);
       serie.setEpisodiosPorTemporada(10);
       serie.setMinutosPorEpisodio(50);
       System.out.println("Duração para Maratonar: "+ serie.getDuracaoEmMinutos());
//*******************************************************************************************
//       Polimorfismo
       CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
       calculadora.inclui(meuFilme);
       calculadora.inclui(serie);
       System.out.println(calculadora.getTempoTotal());
//*******************************************************************************************
//      método para saber se é um bom episódio ou filme
       FiltroRecomendacao filtro = new FiltroRecomendacao();
       filtro.filtra(meuFilme);

       Episodio episodio = new Episodio();
       episodio.setNumero(1);
       episodio.setSerie(serie);
       episodio.setTotalDeVisualizacoes(300);
       filtro.filtra(episodio);
//*******************************************************************************************
//       Listando filmes:
//       1º eu criei um novo filme e coloquei atributos nele
//       2º com os get e setters da classe titulo eu preenchi com os atributos
//       3º criei um arrayList que passei <Filme> que é a minha classe
//4º utilizei o método add para colocar as minhas variáveis meuFilme e filmeDouglas
//       5º imprimi a mensagem na tela com os atributos e utilizei o método size() que foi usado para "contar" quantos filmes tem
//       6º o método get foi para pegar a posição dos filmes e o nome com o get

       var filmeDouglas = new Filme("Cisne Negro",2013);
//       filmeDouglas.setNome();
       filmeDouglas.setDuracaoEmMinutos(200);
       filmeDouglas.avalia(10);
//       ArrayList
//     oq eu estou querendo listar?
//               Filmes
       ArrayList<Filme> listaDeFilmes = new ArrayList<>();
//       Adicionando Filmes
       listaDeFilmes.add(filmeDouglas);
       listaDeFilmes.add(meuFilme);
       System.out.println("Tamanho da Lista: " + listaDeFilmes.size());
                                  //    pegou o primeiro filme da lista + nome
       System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
//       imprimir a lista de filmes inteira
       System.out.println(listaDeFilmes);

    }
}
