//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
package com.javapablosouza20;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner numRecebido = new Scanner(System.in);

        double numero;

        System.out.println(" Digite o número :");
        numero = numRecebido.nextDouble();

        if (numero >= 0 && numero <= 25) {
            System.out.printf(" Esta no intervalo ");
        } else if (numero > 25 && numero <= 50) {
            System.out.printf(" Esta no intervalo ");
        } else if (numero > 50 && numero <= 75) {
            System.out.printf(" Esta no intervalo ");
        } else if (numero > 75 && numero <= 100) {
            System.out.printf(" Esta no intervalo ");
        } else {
            System.out.println(" Fora do intervalo ");
        }
    }
}
