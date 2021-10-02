/*
 * 
 * HE2B-ESI (2021-2022)
 * 
 */
package dev1.javl.test4;

import java.util.Scanner;
/**
 *
 * @author g58446
 */
public class test4 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre entier positif: ");
        int n = clavier.nextInt();

        
        
        if (n<0){   // ce "if" est facultatif et n'est pas demandé explicitement dans l'exercice 
            System.out.println("Vous n'avez pas entré un entier positif. Vous n'avez pas les bases !");
        }
        
        while (n >= 1){
            System.out.println(n);
            n = n - 1;
            
            
        }
    }  
}
