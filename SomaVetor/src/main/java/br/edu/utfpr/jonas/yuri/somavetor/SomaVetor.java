/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.utfpr.jonas.yuri.somavetor;

import java.util.Scanner;

/**
 *
 * @author jonin
 */
public class SomaVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numoros vc vai digitar");
        int qntnum = sc.nextInt();
        float soma =0, media = qntnum;
        
        float num [] = new float [qntnum];
        
        for(int i = 0; i < num.length; i++){
            System.out.println("Digite um numero: ");
            num [i] = sc.nextFloat();
            soma+=num[i];
        }
        media = soma /media;
        System.out.print("Valores = ");
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("");
        System.out.println("Soma ="+soma);
        System.out.println("Media = "+media);
        sc.close();
    }
}
