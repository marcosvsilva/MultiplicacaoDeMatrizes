package java.br.ufg.inf.concorrencia.multiplicacaodematrizes.main;

import java.br.ufg.inf.concorrencia.multiplicacaodematrizes.auxiliares.CriaMatriz;

public class ClassMain {

    private static CriaMatriz criaMatriz = new CriaMatriz();

    public static void main(String[] args) {
        double matrizA[][] = criaMatriz.criaMatrizA();
        double matrizB [][] = criaMatriz.criaMatrizB();
        double matrizProduto[][] = criaMatriz.criaMatrizProduto(matrizA,matrizB);

        int numeroLinhasMatrizProduto = matrizProduto.length;
        int numeroColunasMatrizProduto = matrizProduto[0].length;

        for (int i = 0; i < numeroLinhasMatrizProduto; i++) {
            for (int j = 0; j < numeroColunasMatrizProduto; j++) {
                System.out.print(matrizProduto[i][j] + " ");
            }
            System.out.println();
        }

    }
}
