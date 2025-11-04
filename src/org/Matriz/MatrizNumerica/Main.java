package org.Matriz.MatrizNumerica;

public class Main {
    public static void main(String[] args) {
        int [][] numeros = {
                {5, 2, 3},
                {4, 8, 6},
                {7, 1, 10}
        };

        MatrizNumerica matriz = new MatrizNumerica("Matriz A", numeros);

        matriz.imprimirMatriz();

        boolean resultado = matriz.verificarDiagonal(4);

        System.out.println("\n Todos os valores da diagonal são maiores que 4? " + resultado);
    }
}
