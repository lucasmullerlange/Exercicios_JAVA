package com.company;

public class Main {


    public static void main(String[] args) {

        int largura = 40;
        int altura = 40;
        int[][] matriz = new int[altura][largura];
        for (int linha = 0; linha < altura; linha++) {
            for (int coluna = 0; coluna < largura; coluna++) { matriz[linha][coluna] = (linha + 1) * (coluna + 1);
                System.out.print("\t" + matriz[linha][coluna]);
            }

            System.out.println(""); }
    }
}

