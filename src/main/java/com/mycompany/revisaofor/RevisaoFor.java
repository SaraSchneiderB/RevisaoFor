//somar números pares até um número x

package com.mycompany.revisaofor;

import java.util.Scanner;

public class RevisaoFor {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o último número que você deseja que apareça: "); 
       int n = teclado.nextInt();
       int soma = 0;
       
       for(int i = 2; i <= n; i+=2){
           soma += i;
           System.out.println(i);
       }
        System.out.println("A soma dos números pares até " + n + " é " + soma);
    }
}
 
/*
int i = 0 é o inicializador, em qual posição o i (contador) vai iniciar
i <= n significa que enquanto i for menor ou igual a n, o LOOP vai continuar
i++ significa que cada vez que o LOOP é realizado, será adicionado mais 1 (2 3 4 5 ...)
i+=2 significa que a cada vez que o LOOP é realizado, será adicionado 2 (2 4 6 8 10...)
*/