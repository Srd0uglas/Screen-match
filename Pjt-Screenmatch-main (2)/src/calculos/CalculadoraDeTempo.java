package calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

//    eu quero que a calculadora some, não definir um valor para ela, por isso é get sem set
    public int getTempoTotal() {
        return tempoTotal;
    }
//    Método para calcular o tempo em minutos tanto da Série quanto do filme, usamos a clsse titulo pois ela é uma herança
    public void inclui(Titulo titulo){
        tempoTotal = tempoTotal + titulo.getDuracaoEmMinutos();
    }

}
