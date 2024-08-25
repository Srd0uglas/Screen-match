package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBuscas {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
//        var ele já entende que é uma String
        var busca = leitura.nextLine();
        String url = "https://www.omdbapi.com/?t="+busca+"&apikey=c131acbf";

        //        ( 4 linhas abaixo ) -> Request = faz a requisição
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();



//        Response = dá a resposta
                HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
//        Imprimir
        System.out.println(response.body());
    }
}
