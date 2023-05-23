/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetocomorientacao;

import java.util.Scanner;
import triangulo.Triangulo;

/**
 *
 * @author jonin
 */
public class ProjetocomOrientacao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();
       
        
        System.out.println("Informe os valores triangulo x");
        x.a= ler.nextDouble();
        x.b= ler.nextDouble();
        x.c= ler.nextDouble();
        System.out.println("Informe os valores triangulo y");
        y.a= ler.nextDouble();
        y.b= ler.nextDouble();
        y.c= ler.nextDouble();
        
     
        
      
        double areaX= x.area();
        double areaY= y.area();
       
        
        
        System.out.println("Triagulo x area: "+areaX);
        System.out.println("Triagulo y area: "+areaY);
        
        if(areaX>areaY){
            System.out.println("Area do triangulo X é a maior");
        }else
            System.out.println("Area do triangulo Y é a maior ");
       ler.close();
    }
}
