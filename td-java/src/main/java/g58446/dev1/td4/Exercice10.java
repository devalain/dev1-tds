/*
 * 
 * HE2B-ESI (2021-2022)
 * 
 */
package g58446.dev1.td4;

import java.util.Scanner;

/**
 *
 * @author g58446
 */
public class Exercice10 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez une série de nombres positifs (entrez -1 pour terminer)");
        int valeur = clavier.nextInt();
        int premier = valeur;
        int dernier = valeur;
        /** Il faut que je trouve un moyen de redefinir dernier (voir 10bis foireux):
         *  
         */
        int sentinelle = -1;
        
        while (valeur > sentinelle) { 
            System.out.println("Entrez un autre nombre: ");
            valeur = clavier.nextInt();
            
        
        }
    }
}

// Exercice à terminer