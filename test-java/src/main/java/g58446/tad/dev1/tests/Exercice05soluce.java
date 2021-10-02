/*
 *  HE2B-ESI (2021-2022)
 */
package g58446.tad.dev1.tests;

import java.util.Scanner;

public class Exercice05soluce {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Combien de valeurs voulez-vous entrer?");
        int nbValeursTotal = clavier.nextInt();
        int somme = 0;
        double moyenne = 0;
        int nbValeurs = 0;

        System.out.println("Entrez " + nbValeursTotal + " valeurs");
        while (nbValeurs < nbValeursTotal) {
            int valeur = clavier.nextInt();
            somme = somme + valeur;
            nbValeurs = nbValeurs + 1;
        }

        moyenne = (double) somme / nbValeurs;

        System.out.println("La somme de toutes ces valeurs: " + somme);
        System.out.println("La moyenne de toutes ces valeurs: " + moyenne);
    }
}