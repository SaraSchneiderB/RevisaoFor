/*
Fibonacci
 */
package com.mycompany.revisaofor;

public class ExFibonacci {
    public static void main(String[] args) {    //psvm TAB
        int n = 10;
        int primeiroTermo = 0;
        int segundoTermo = 1;
        
        System.out.println("Os primeiros  " + n + "números da sequência Fibonacci são:  \n");
        System.out.println(primeiroTermo + " " + segundoTermo + " ");
        
        for(int i = 3; i <= n; i++){
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.println(proximoTermo + " ");
            
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
