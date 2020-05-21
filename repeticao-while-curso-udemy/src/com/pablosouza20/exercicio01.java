// Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
package com.pablosouza20;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner senhaRecebida = new Scanner(System.in);

        int senha = 0;

        System.out.println(" Digite a senha ");
        senha = senhaRecebida.nextInt();

        while (senha != 2002) {
            System.out.println(" Acesso negado !");
            System.out.println(" Digite a senha ");
            senha = senhaRecebida.nextInt();
        }
        System.out.println(" Acesso permitido !");
    }
}
