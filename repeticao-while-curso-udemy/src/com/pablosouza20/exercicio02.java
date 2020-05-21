// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
package com.pablosouza20;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner numRecebido = new Scanner(System.in);

        int x = numRecebido.nextInt();
        int y = numRecebido.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println(" QUADRANTE 1 ");
            } else if (x < 0 && y > 0) {
                System.out.println(" QUADRANTE 2 ");
            } else if (x < 0 && y < 0) {
                System.out.println(" QUADRNATE 3 ");
            } else {
                System.out.println(" QUADRANTE 4 ");
            }
            x = numRecebido.nextInt();
            y = numRecebido.nextInt();
        }
    }
}