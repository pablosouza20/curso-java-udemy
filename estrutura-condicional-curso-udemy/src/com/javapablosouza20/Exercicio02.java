// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
package com.javapablosouza20;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner numRecebido = new Scanner(System.in);

        int a;

        System.out.println(" Digite o número :");
        a = numRecebido.nextInt();

        if (a % 2 == 0) {
            System.out.println(" Este número é par: " + a);
        } else {
            System.out.println(" Este número é negativo: " + a);
        }
    }
}
