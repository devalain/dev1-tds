/*
 *  HE2B-ESI (2021-2022)
 */
package g58446.tad.dev1.td4;

import java.util.Scanner;
/**
 *
 * @author g58446
 */
public class Exercice06 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Combien de valeurs voulez-vous introduire? ");
        int nbValeursTotal = clavier.nextInt();
        int nbValeur = 0;
        int valeur = 0;
        int pos = 0;
        int neg = 0;
        int nul = 0;
        
        while (nbValeur<nbValeursTotal){
            System.out.println("Entrez une valeur: ");
            valeur = clavier.nextInt ();
            nbValeur = nbValeur + 1;
            if (valeur>0){
                pos = pos + 1;
            } else if (valeur<0){
                neg = neg + 1;
            } else {
                nul = nul + 1;    
            } 
        }
        
        System.out.println("positifs: " + pos);
        System.out.println("négatifs: " + neg);
        System.out.println("nuls: " + nul);
            
    }
}
