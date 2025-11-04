package org.Matriz.MatrizNumerica;

public class MatrizNumerica {
    private String nomeMatriz;
    private int[][] matrizNumeros;

    public MatrizNumerica() {
        this.nomeMatriz = "Matriz Desconhecida";
        this.matrizNumeros = new int[3][3];
    }

    public MatrizNumerica(String nomeMatriz, int[][] matrizNumeros) {
        this.nomeMatriz = nomeMatriz;
        this.matrizNumeros = matrizNumeros;
    }

    public void imprimirMatriz() {
        System.out.println("Nome da matriz: ");
        System.out.println("Valores da matriz:");

        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                System.out.println(matrizNumeros[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarDiagonal(int valorMinimo){
        for (int i = 0; i < matrizNumeros.length; i ++){
            if (matrizNumeros[i][i] <= valorMinimo){
                return false;
            }
        }
        return true;
    }
}
