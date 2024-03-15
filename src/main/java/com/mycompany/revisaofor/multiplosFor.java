/*
Multiplos de 3 e 5 até 20
 */
package com.mycompany.revisaofor;

public class multiplosFor {
    public static void main(String[] args) {
        System.out.println("Os multiplos de 3 e/ou 5 até 20 são: ");
        for(int i = 1; i <= 20; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " é multiplo de 3 e 5");
            }else if(i % 3 == 0){
                System.out.println(i + " é multiplo de 3");
            }else if(i % 5 == 0){
                System.out.println(i + " é multiplo de 5");
            }
        }
    }
    
}
