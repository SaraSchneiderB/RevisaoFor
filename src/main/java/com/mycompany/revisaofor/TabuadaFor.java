package com.mycompany.revisaofor;

import java.util.Scanner;

public class TabuadaFor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número para a tabuada: \n");
        int numero = teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + " = " + (numero * i));
        }
    }
}
