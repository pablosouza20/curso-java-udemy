// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
package com.javapablosouza20;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner numRecebido = new Scanner(System.in);

        int a;

        System.out.println(" Digite o número :");
        a = numRecebido.nextInt();

        if (a < 0) {
            System.out.println(" Este número é negativo: " + a);
        } else {
            System.out.println(" Este número não é negativo: " + a);
        }
    }
}
