// Faça um programa para ler o valor do raio de um círculo,
//e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159
package com.javapablosouza20;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner numRecebido = new Scanner(System.in);

        double area;
        double raio;
        double pi = 3.14159;

        System.out.println(" Digite o valor do Raio: ");
        raio = numRecebido.nextDouble();

        area = pi * raio * raio;

        System.out.printf("A=%.4f%n", area);
    }
}
