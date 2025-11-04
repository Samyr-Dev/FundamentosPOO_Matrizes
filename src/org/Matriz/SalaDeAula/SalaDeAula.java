package org.Matriz.SalaDeAula;

public class SalaDeAula {
    private String nomeTurma;
    private int[][] notasAlunos;

    public SalaDeAula() {
        this.nomeTurma = "Turma Desconhecida";
        this.notasAlunos = new int[5][3];
    }

    public SalaDeAula(String nomeTurma, int[][] notasAlunos) {
        this.nomeTurma = nomeTurma;
        this.notasAlunos = notasAlunos;
    }

    public void imprimirInformacoes() {
        System.out.println("A turma é: " + nomeTurma);
        System.out.println("Notas dos alunos: ");

        for (int i=0; i < notasAlunos.length; i ++){
            System.out.println("Aluno " + (i+1) + ": ");
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println(notasAlunos[i][j] + " ");
            };
            System.out.println();
        }
    }

    public boolean verificarNotasAcima(int media) {
        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                if (notasAlunos[i][j] < media) {
                    return false;
                }
            }
        }
        return true;
    }
}
