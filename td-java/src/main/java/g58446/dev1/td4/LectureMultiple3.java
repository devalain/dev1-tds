/*
 *  HE2B-ESI (2021-2022)
 */
package g58446.dev1.td4;

import java.util.Scanner;
/**
 *
 * @author unknown
 */
public class LectureMultiple3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez les valeurs (terminez par -1)");
        int valeur = clavier.nextInt();
        int somme = 0;
        int nbValeurs = 0;
        
        while(valeur> -1) {
            somme = somme + valeur;
            nbValeurs = nbValeurs + 1;
            System.out.println("entrez une valeur: ");
            valeur = clavier.nextInt();
        }
        System.out.println("Vous avez entré: " + nbValeurs +" valeurs");
        System.out.println("La somme de toutes ces valeurs: " + somme);
    }
}
