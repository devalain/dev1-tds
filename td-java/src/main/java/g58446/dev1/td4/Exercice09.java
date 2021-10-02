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
public class Exercice09 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Combien de valeurs voulez-vous introduire? ");
        int n = clavier.nextInt();
        int compteur = 0;
        int valeur;
        int max = 0;
        int min = 0;
        
        
        while ( compteur < n ){
            System.out.println("entrez une valeur: ");
            valeur = clavier.nextInt();
            if (max < valeur){
                max = valeur;
            }
            if (min > valeur){
                min = valeur;
            }
            compteur++;
        }
        System.out.println("Le maximum est " + max);
        System.out.println("Le minimum est " + min);
    }
}
