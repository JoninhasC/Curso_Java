/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.utfpr.jonas.problemanegativos;

import java.util.Scanner;

/**
 *
 * @author jonin
 */
public class ProblemaNegativos {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num [] = new int [10];
         
         System.out.println("Quantos numeros vc quer digitar? ");
         int qntnum = sc.nextInt();
         
         
         for (int i = 0; i < qntnum; i++) {
             System.out.println("Digite um numero");
             num[i]= sc.nextInt();
        }
         System.out.println("NUMEROS NEGATIVOS:");
         for (int i = 0; i < qntnum; i++) {
             if(num[i] < 0)
                 System.out.println(num[i]);
        }
    }
}
