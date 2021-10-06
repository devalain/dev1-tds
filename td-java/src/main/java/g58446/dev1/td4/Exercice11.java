/*
 *  HE2B-ESI (2021-2022)
 */
package g58446.dev1.td4;

import java.util.Scanner;

/**
 *
 * @author g58446
 */
public class Exercice11 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez une série de nombres positifs qui terminent"
                + " par -1(valeur sentinelle): ");
        int valeur = clavier.nextInt();
        int précédent;
        final int sentinelle = -1;
        boolean sérieEstStrictementCroissante = true;
        
        while (valeur > sentinelle) {
            précédent = valeur;
            System.out.println("entrez une nouvelle valeur: ");
            valeur = clavier.nextInt();
            if (valeur != sentinelle) {
                sérieEstStrictementCroissante &= valeur > précédent;
            }
        }

        if (sérieEstStrictementCroissante) {
            System.out.println("La série est strictement croissante");
        } else {
            System.out.println("La série n'est pas strictement croissante");
        }
    }
}
