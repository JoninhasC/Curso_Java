/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.edu.utfpr.jonas.yuri.exerciomatrixmxn;

import java.util.Scanner;

/**
 *
 * @author jonin
 */
public class ExercioMatrixMxN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero de colunas ");
        int N = sc.nextInt();
        System.out.println("Informe o numero de linhas");
        int M = sc.nextInt();

        int[][] matriz = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Informe o numero da caluna " + i + " e da linha " + j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Informe o numero que deseja ver ");
        int num = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (num == matriz[i][j]) {
                    System.out.println("Posição = " + i + "," + j);
                    System.out.println("" + matriz[i][j]);
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);

                    }
                }
            }
        }
        sc.close();
    }
}
