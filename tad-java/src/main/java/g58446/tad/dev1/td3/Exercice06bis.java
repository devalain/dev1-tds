/*
 *  HE2B-ESI (2021-2022)
 */
package g58446.tad.dev1.td3;

import java.util.Scanner;

/**
 *
 * @author g58446
 */
public class Exercice06bis {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un premier nombre:");
        double n1 = clavier.nextDouble();
        System.out.println("Entrez un deuxième nombre:");
        double n2 = clavier.nextDouble();
        System.out.println("Entrez un troisième nombre:");
        double n3 = clavier.nextDouble();

        if (n1 > n2) {
            if (n1 > n3){
                System.out.println("Le plus grand est: "+ n1);
            } else { 
                System.out.println("Le plus grand est: "+ n3);
            }
        } else { // n2 >= n1
            if ( n3 > n2 ){
                System.out.println("Le plus grand est:"+ n3);
            } else {
                System.out.println("Le plus grand est:"+ n2);
            }
        }
    }
}
