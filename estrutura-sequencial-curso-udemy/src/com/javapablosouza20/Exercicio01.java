// Faça um programa para ler dois valores inteiros,
//e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.
package com.javapablosouza20;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner numRecebido = new Scanner(System.in);

        int a;
        int b;
        int soma;

        System.out.println(" Digite o valor de A: ");
        a = numRecebido.nextInt();

        System.out.println(" Digite o valor de B: ");
        b = numRecebido.nextInt();

        soma = a + b;

        System.out.println(" Valor obtido pela soma de A + B = " + soma);
    }
}
