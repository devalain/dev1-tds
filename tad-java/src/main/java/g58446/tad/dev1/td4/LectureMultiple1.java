/*
 *  HE2B-ESI (2021-2022)
 */
package g58446.tad.dev1.td4;

import java.util.Scanner;

/**
 *
 * @author unknown
 */
public class LectureMultiple1 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        int somme = 0;
        int nbValeurs = 0;
        
        System.out.println("Entrez 10 valeurs");
        while(nbValeurs < 10) {
            int valeur = clavier.nextInt ();
            somme = somme + valeur;
            nbValeurs = nbValeurs + 1;
        }
        System.out.println("La somme de toutes ces valeurs: "+ somme);
    }
}
