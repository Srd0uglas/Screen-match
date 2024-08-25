package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme( "As vantagens de ser Invisível",2010);
        meuFilme.avalia(9);
        Serie serie = new Serie("Lost",2018);
        serie.avalia(7.5);
        Filme filmeDouglas = new Filme("Cisne Negro",2013);
        filmeDouglas.avalia(3);


//        deu erro quando é pediddo para mostrar a série pois no array estou passando um filme e tem que ser o título
        ArrayList<Titulo> lista = new ArrayList<>();
//       Adicionando Filmes
        lista.add(filmeDouglas);
        lista.add(meuFilme);
//        adicionar a minha série
        lista.add(serie);
//        titulo é minha class
        for (Titulo item : lista) {

            System.out.println(item.getNome());
//            classificação dos filmes e séries
//            precisamos usar esse if para verificaser se o título é uma série ou filme
            if (item instanceof Filme) {
                //A classe filme + variável filme = recebe (casting) item
                Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }

//            mostrar a avaliação de serie

        }
//        Se eu quiser fazer uma busca específica
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("jaqueline");
        buscaPorArtista.add("Paulo");


        //  ordenar por ordem alfabética
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);


        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordendando por ano: ");
        System.out.println(lista);
    }
}
