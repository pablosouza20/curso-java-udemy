//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
package com.javapablosouza20;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner horaRecebida = new Scanner(System.in);

        int horaInicial;
        int horaFinal;
        int duração;

        System.out.println(" Digite a hora inicial :");
        horaInicial = horaRecebida.nextInt();

        System.out.println(" Digite a hora final :");
        horaFinal = horaRecebida.nextInt();

        if (horaInicial > horaFinal) {
            duração = (24 - horaInicial) + horaFinal;
            System.out.println(" Essa foi a duração do jogo " + duração + " horas ");
        } else {
            duração = (horaFinal - horaInicial);
            System.out.println(" Essa foi a duração do jogo: " + duração + " horas ");
        }
    }
}
