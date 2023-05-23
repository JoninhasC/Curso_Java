/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetosemorientacao;

import java.util.Scanner;

/**
 *
 * @author jonin
 */
public class ProjetosemOrientacao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double xA, xB,xC,yA,yB,yC;
        double p =0 ;
        double areaX, areaY;
        System.out.println("Informe os valores triangulo x");
        xA= ler.nextDouble();
        xB= ler.nextDouble();
        xC= ler.nextDouble();
        System.out.println("Informe os valores triangulo y");
        yA= ler.nextDouble();
        yB= ler.nextDouble();
        yC= ler.nextDouble();
        
     
        p  =(xA+xB+xC)/2;
        areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        
        p  =(yA+yB+yC)/2;
        areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        
        
        System.out.println("Triagulo x area: "+areaX);
        System.out.println("Triagulo y area: "+areaY);
        
        if(areaX>areaY){
            System.out.println("Area do triangulo X é a maior");
        }else
            System.out.println("Area do triangulo Y é a maior ");
       ler.close();
    }
}
