// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
//Calcule e mostre o valor a ser pago.
package com.javapablosouza20;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner codigo1Recebido = new Scanner(System.in);
        Scanner quantidade1Recebido = new Scanner(System.in);
        Scanner valor1Recebido = new Scanner(System.in);

        Scanner codigo2Recebido = new Scanner(System.in);
        Scanner quantidade2Recebido = new Scanner(System.in);
        Scanner valor2Recebido = new Scanner(System.in);

        int codigoPeça1;
        int quantidadePeça1;
        double valorPeça1;
        int codigoPeça2;
        int quantidadePeça2;
        double valorPeça2;
        double preçoFinal;

        System.out.println(" Digite o código da peça 1 : ");
        codigoPeça1 = codigo1Recebido.nextInt();

        System.out.println(" Digite a quantidade da peça 1 : ");
        quantidadePeça1 = quantidade1Recebido.nextInt();

        System.out.println(" Digite o valor da peça 1 : ");
        valorPeça1 = valor1Recebido.nextDouble();

        System.out.println(" Digite o código da peça 2 : ");
        codigoPeça2 = codigo2Recebido.nextInt();

        System.out.println(" Digite a quantidade da peça 2 : ");
        quantidadePeça2 = quantidade2Recebido.nextInt();

        System.out.println(" Digite o valor da peça 2 : ");
        valorPeça2 = valor2Recebido.nextDouble();

        preçoFinal = (valorPeça1 * quantidadePeça1 + valorPeça2 * quantidadePeça2);

        System.out.printf(" Preço final da compra R$ %.2f%n ", preçoFinal);
    }
}
