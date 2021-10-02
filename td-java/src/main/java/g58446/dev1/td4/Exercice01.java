/*
 *  HE2B-ESI (2021-2022)
 */
package g58446.dev1.td4;

import java.util.Scanner;

/**
 *
 * @author g58446
 */
public class Exercice01 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre entier n: ");
        int n = clavier.nextInt();
        System.out.println("Les nombres entiers de 1 à " + n);
        int compteur = 1;

        while (compteur <= n) {
            System.out.println(compteur);
            compteur = compteur + 1;

        }
        
        System.out.println("");
        System.out.println("Les nombres pairs qui sont compris entre 1 et " + n);
        compteur = 1;
        
        while (compteur <=n) {
            if (compteur % 2 == 0) {
                System.out.println(compteur);
            }
            compteur = compteur + 1;
        }
        
        System.out.println("");
        System.out.println("Les nombres de -" + n + " à " + n);
        compteur = -n;
        
        while (compteur <= n) {
            System.out.println(compteur);
            compteur = compteur + 1;
        }
        
        System.out.println("");
        System.out.println("Les multiples de 5 qui sont compris entre 1 et " + n);
        compteur = 1;
        
        while (compteur <= n) {
            if (compteur % 5 == 0){
                System.out.println(compteur);
            }
            compteur = compteur + 1;
        }
        
        System.out.println("");
        System.out.println("Les multiplies de " + n + " compris entre 1 et 100");
        compteur = 1;
        
        while (compteur <= 100) {
            if (compteur % n == 0) {
                System.out.println(compteur);
            }
        compteur = compteur +1;
        }       
    }
}
