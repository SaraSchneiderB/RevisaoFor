
package com.mycompany.revisaofor;

import java.util.Scanner;

public class VerificarPrimos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        boolean numeroPrimo = true;
        
        for(int i = 2; i <= numero / 2; i++){
            if(numero % i == 0){
                numeroPrimo = false;
                break;
            }
        }
        if(numeroPrimo){
            System.out.println(numero + " é um número primo");
        }else{
            System.out.println(numero + " não é um número primo");
        }
    }
}
