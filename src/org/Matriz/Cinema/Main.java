package org.Matriz.Cinema;

public class Main {
    public static void main(String[] args) {
        boolean[][] mapaAssentos = {
                {true, false, true, false, false},
                {true, true, true, true, false},
                {false, false, false, false, false},
                {true, false, false, true, false},
                {true, true, false, true, true}

        };

        Cinema cinema = new Cinema("Cinema Premium", mapaAssentos);

        cinema.imprimirAssentos();

        boolean resultado = cinema.verificarLotacaoFileira(2, 3);
        System.out.println("\n A fileira 2 está acima do limite de 3 ocupações? " + resultado);
    }
}
