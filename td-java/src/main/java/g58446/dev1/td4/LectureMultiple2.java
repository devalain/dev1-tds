/*
 *  HE2B-ESI (2021-2022)
 */
package g58446.dev1.td4;

import java.util.Scanner;
/**
 *
 * @author unknown
 */
public class LectureMultiple2 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        System.out.println("Combien de valeurs voulez-vous entrer ?");
        int nbValeursTotal = clavier.nextInt();
        
        int somme = 0;
        int nbValeurs = 0;
        
        while (nbValeurs < nbValeursTotal) {
            System.out.println("Entrez une valeur: ");
            int valeur = clavier.nextInt();
            somme = somme + valeur;
            nbValeurs = nbValeurs + 1;    
        }
        System.out.println("Vous avez entré : " + nbValeursTotal + " valeurs");
        System.out.println("La somme de toutes ces valeurs: " + somme);
    }
}
