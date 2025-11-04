package org.Matriz.EstoqueLoja;

public class Main {

    public static void main(String[] args) {
        int [][] lotes = {
                {100, 30},
                {80, 60 },
                {50, 20},
                {120, 90}
        };
        EstoqueLoja estoqueLoja = new EstoqueLoja("Carros : ", lotes);

        estoqueLoja.imprimirEstoque();

        boolean temCritico = estoqueLoja.verificarLoteCritico(70);

        System.out.println("\n Existe lote com venda acima de 70? " + temCritico);
    }
}
