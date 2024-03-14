package com.mycompany.revisaofor;

import java.util.Scanner;

public class ContagemRegressiva {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número para iniciar a contagem regressiva: ");
        int x = teclado.nextInt();

        for (int i = x; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
