// Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.
package com.pablosouza20;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner tipoRecebido = new Scanner(System.in);

        int tipo;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println(" Digite o tipo de combustível");
        tipo = tipoRecebido.nextInt();

        while (tipo != 4) {
            switch (tipo) {
                case 1:
                    alcool = alcool + 1;
                    break;

                case 2:
                    gasolina = gasolina + 1;
                    break;

                case 3:
                    diesel = diesel + 1;
                    break;
            }
            tipo = tipoRecebido.nextInt();
        }
        System.out.println(" MUITO OBRIGADO ");
        System.out.println(" Alcool " + alcool);
        System.out.println(" Gasolina " + gasolina);
        System.out.println(" Diesel " + diesel);
    }
}