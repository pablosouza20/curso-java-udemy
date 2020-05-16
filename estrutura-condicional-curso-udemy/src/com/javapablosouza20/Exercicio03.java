// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.
package com.javapablosouza20;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner numRecebido = new Scanner(System.in);

        int a;
        int b;

        System.out.println(" Digite o número :");
        a = numRecebido.nextInt();

        System.out.println(" Digite o número: ");
        b = numRecebido.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println(" São múltiplos ");
        } else {
            System.out.println(" Não são múltiplos ");
        }
    }
}
