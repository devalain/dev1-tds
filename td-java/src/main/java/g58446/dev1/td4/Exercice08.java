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
public class Exercice08 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez une série de nombres positifs(terminez par -1): ");
        int valeur = clavier.nextInt();
        int max = valeur;
        
        while (valeur > -1) {
            System.out.println("Entrez une autre nombre: ");
            valeur = clavier.nextInt();
            if (valeur > max){
                max = valeur; 
            }
        }
        System.out.println("Le maximum est " + max);
    }
}
