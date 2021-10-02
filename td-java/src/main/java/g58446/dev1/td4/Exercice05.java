/*
 *  HE2B-ESI (2021-2022)
 */
package g58446.dev1.td4;

import java.util.Scanner;
/**
 *
 * @author g58446
 */
public class Exercice05 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Je calcule la moyenne de plusieurs valeurs: Combien de valeurs voulez-vous introduire ? ");
        int nbValeursTotal = clavier.nextInt();
        int nbValeurs = 0;
        double somme = 0;
        
        while (nbValeurs < nbValeursTotal ) {
            System.out.println("Entrez une valeur: ");
            double valeur = clavier.nextDouble();
            somme = somme + valeur;
            nbValeurs = nbValeurs + 1;      
        }
        
        if (nbValeursTotal == 1) {
                System.out.println("Vous n'avez entré qu'une seule valeur ! La somme et la moyenne valent donc " + somme);
        } else {
                System.out.println("Vous avez entré " + (nbValeursTotal) + " valeurs."); 
                System.out.println("La somme de ces valeurs vaut " + somme);
                System.out.println("La moyenne de ces valeurs vaut " + (somme/nbValeursTotal));
                
        }
        
    }
    
}
