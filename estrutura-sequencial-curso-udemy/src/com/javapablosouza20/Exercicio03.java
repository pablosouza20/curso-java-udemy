// Fazer um programa para ler quatro valores inteiros A, B, C e D.
// A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
package com.javapablosouza20;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner numRecebido = new Scanner(System.in);

        int A;
        int B;
        int C;
        int D;
        int diferença;

        System.out.println(" Digite o valor de A: ");
        A = numRecebido.nextInt();

        System.out.println(" Digite o valor de B: ");
        B = numRecebido.nextInt();

        System.out.println(" Digite o valor de C: ");
        C = numRecebido.nextInt();

        System.out.println(" Digite o valor de D: ");
        D = numRecebido.nextInt();

        diferença = (A * B - C * D);

        System.out.println(" Mostre a diferença do calculo " + diferença);
    }
}
