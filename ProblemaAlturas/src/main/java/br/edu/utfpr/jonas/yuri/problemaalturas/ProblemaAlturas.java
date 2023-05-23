package br.edu.utfpr.jonas.yuri.problemaalturas;

import entites.Pessoas;
import java.util.ArrayList;
import java.util.Scanner;

public class ProblemaAlturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoas> pessoa = new ArrayList<>();
        double mediaAltura =0; 
        double menos16 = 0; 
        
        System.out.println("Quantas pessoas serão digitadas? ");
        int qntpessoas = sc.nextInt();
         sc.nextLine();
        for (int i = 0; i < qntpessoas; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            mediaAltura += altura;
            Pessoas pessoaAtual = new Pessoas(nome, idade, altura);
            pessoa.add(pessoaAtual);
        }
        System.out.println("");
        for (Pessoas p : pessoa) {
            if(p.getAltura()<16)
                menos16++;
        }
        mediaAltura =mediaAltura/qntpessoas;
        menos16 = (menos16/qntpessoas)*100;
        System.out.println("Altura Media: "+mediaAltura);
        System.out.println("Pessoas com menos de 16 anos: "+menos16);
        for (Pessoas p : pessoa) {
            if(p.getAltura() < 16){
                System.out.println("Nome: " + p.getNome());
                
            }
        }
        sc.close();
    }
}
