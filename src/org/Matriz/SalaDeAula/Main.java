package org.Matriz.SalaDeAula;

public class Main {
    public static void main(String[] args) {

        int [][] notas = {
                {8, 9, 7},
                {7, 7, 7},
                {7, 8, 9},
        };

        SalaDeAula salaDeAula = new SalaDeAula("7° Ano B ", notas);

        salaDeAula.imprimirInformacoes();

        boolean resultado = salaDeAula.verificarNotasAcima(6);
        System.out.println("\n Todas as notas são maiores ou iguais a 6?" + resultado);
    }
}
