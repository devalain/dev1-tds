/*
 *  HE2B-ESI (2021-2022)
 */
package g58446.tad.dev1.td4;

import java.util.Scanner;

/**
 *
 * @author g58446
 */
public class Exercice04 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int nbValeur = 0;
        
        while (nbValeur < 10){
            System.out.println("Entrez un nombre entier (" + (nbValeur+1) + " sur 10)");
            int valeur = clavier.nextInt();
            if (valeur % 2 == 0) {
                System.out.println("Ce nombre entier est paire");
            } else {
                System.out.println("Ce nombre entier est impair");
            }
        nbValeur = nbValeur + 1;
        }    
    }
}
