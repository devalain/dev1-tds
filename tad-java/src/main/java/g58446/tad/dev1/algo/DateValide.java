/*
 *  HE2B-ESI (2021-2022)
 */
package g58446.tad.dev1.algo;

import java.util.Scanner;

/**
 *
 * @author g58446
 */
public class DateValide {

    /*
    *   Vérifie que les entiers entrés correspondent à une date valide
    *   
     */
    public static boolean estAnnéeBissextile(int année) {
        return (année % 4 == 0 && année % 100 != 0) || année % 400 == 0;
    }

    public static int nombreJoursMois(int mois, int année) {
        int nbJours;

        switch (mois) {

            case 1, 3, 5, 7, 8, 10, 12 ->
                nbJours = 31;
            case 4, 6, 9, 11 ->
                nbJours = 30;
            default -> {
                if (estAnnéeBissextile(année)) {
                    nbJours = 29;
                } else {
                    nbJours = 28;
                }
            }

        }
        return nbJours;
    }

    public static boolean estDateValide(int jour, int mois, int année) {
        return jour <= nombreJoursMois(mois, année)
                && jour >= 1
                && mois <= 12
                && mois >= 1;      //formatage manuel pour la lisibilité

    }
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez le jour: ");
        int jour = clavier.nextInt();
        System.out.println("Entrez le mois: ");
        int mois = clavier.nextInt();
        System.out.println("Entrez l'année ");
        int année = clavier.nextInt();

        System.out.println(jour + "/" + mois + "/" + année);

        if (estDateValide(jour, mois, année)) {
            System.out.println("Bravo, vous êtes capable d'entrer une date"
                    + " valide !");
        } else {
            System.out.println("L'important, c'est de participer !");
        }
    
    }
}
