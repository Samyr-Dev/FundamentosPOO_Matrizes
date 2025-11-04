package org.Matriz.Cinema;

public class Cinema {
    private String nomeCinema;
    private boolean[][] assentos;

    public Cinema() {
        this.nomeCinema = "Cinema Desconhecido";
        this.assentos = new boolean[5][5];
    }

    public Cinema(String nomeCinema, boolean[][] assentos) {
        this.nomeCinema = nomeCinema;
        this.assentos = assentos;
    }

    public void imprimirAssentos() {
        System.out.println("Cinema " + nomeCinema);
        System.out.println("Mapa de assentos: L = Livre e O = Ocupado" );

        for (int i = 0; i < assentos.length; i++) {
            System.out.println("Fileira " + (i + 1) + ": ");
            for (int j = 0; j < assentos[i].length; j++) {
                if (assentos[i][j]) {
                    System.out.println("O ");
                } else {
                    System.out.println("L ");
                }
            }
        }
        System.out.println();
    }


    public boolean verificarLotacaoFileira(double limiteOcupacao, int numeroFileira) {
        int index = numeroFileira -1;

        if (index <0 || index >= assentos.length){
            System.out.println("Número de fileira Inválido");
            return false;
        }
        int ocupados = 0;
        for (int j = 0; j < assentos[index]. length; j++){
            if (assentos[index][j]){
            }
        }
        return ocupados > limiteOcupacao;
    }
}

