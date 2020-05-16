//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.
package com.javapablosouza20;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner codigoRecebido = new Scanner(System.in);
        Scanner quantidadeRecebida = new Scanner(System.in);
        Scanner calculoRecebido = new Scanner(System.in);

        int codigo;
        int quantidade;
        double calculo;

        System.out.println(" Digite o código desejado :");
        codigo = codigoRecebido.nextInt();

        System.out.println(" Digite a quantidade :");
        quantidade = quantidadeRecebida.nextInt();

        if (codigo == 1) {
            calculo = (quantidade * 4.0);
            System.out.printf(" Escolha de " + quantidade + " Cachorro Quente por R$ %.2f%n ", calculo);
            System.out.println(" Volte sempre !");
        } else if (codigo == 2) {
            calculo = (quantidade * 4.50);
            System.out.printf(" Escolha de " + quantidade + " X - Salada por R$ %.2f%n ", calculo);
            System.out.println(" Volte sempre !");
        } else if (codigo == 3) {
            calculo = (quantidade * 5.0);
            System.out.printf(" Escolha de " + quantidade + " X - Bacon por R$ %.2f%n ", calculo);
            System.out.println(" Volte sempre !");
        } else if (codigo == 4) {
            calculo = (quantidade * 2.0);
            System.out.printf(" Escolha de " + quantidade + " Torrada Simples por R$ %.2f%n ", calculo);
            System.out.println(" Volte sempre !");
        } else if (codigo == 5) {
            calculo = (quantidade * 4.0);
            System.out.printf(" Escolha de " + quantidade + " Refrigerante por R$ %.2f%n ", calculo);
            System.out.println(" Volte sempre !");
        } else {
            System.out.println(" Código inválido ");
        }
    }
}
