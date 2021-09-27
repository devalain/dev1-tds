/*
 *  HE2B-ESI (2021-2022)
 */
package g58446.tad.dev1.td4;

import java.util.Scanner;

/**
 *
 * @author g58446
 */
public class Exercice07 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez une série d'entiers positifs (terminez par -1)");
        int valeur = clavier.nextInt();
        int premier = valeur;
        
        while (valeur > -1){
            int dernier = valeur;
            System.out.println("entrez une nouvelle valeur: ");
           
            valeur = clavier.nextInt();
        }
    }   
}

