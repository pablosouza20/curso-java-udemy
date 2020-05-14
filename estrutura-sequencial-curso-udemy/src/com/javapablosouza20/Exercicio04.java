// Fazer um programa que leia o número de um funcionário,
//seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário.
//A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.
package com.javapablosouza20;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner numRecebido = new Scanner(System.in);
        Scanner horasRecebidas = new Scanner(System.in);
        Scanner valorRecebido = new Scanner(System.in);

        int numero;
        int horasTrabalhadas;
        double valorHora;
        double salario;

        System.out.println(" Digite o número do funcionário : ");
        numero = numRecebido.nextInt();

        System.out.println(" Digite as horas trabalhadas pelo funcionário : ");
        horasTrabalhadas = numRecebido.nextInt();

        System.out.println(" Digite o valor recebido por hora trabalhada : ");
        valorHora = numRecebido.nextDouble();

        salario = (horasTrabalhadas * valorHora);

        System.out.printf(" Mostre o salário do funcionário R$ %.2f%n ", salario);
    }
}
