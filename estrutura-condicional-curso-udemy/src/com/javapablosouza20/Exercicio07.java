// Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.
package com.javapablosouza20;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner numRecebido = new Scanner(System.in);

        double x;
        double y;

        System.out.println(" Digite o valor de X :");
        x = numRecebido.nextDouble();

        System.out.println(" Digite o valor de Y :");
        y = numRecebido.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println(" ORIGEM ");
        } else if (x == 0.0) {
            System.out.println(" EIXO Y ");
        } else if (y == 0.0) {
            System.out.println(" EIXO X ");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println(" QUADRANTE 1 ");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println(" QUADRANTE 2 ");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println(" QUADRANTE 3 ");
        } else {
            System.out.println(" QUADRANTE 4 ");
        }
    }
}
