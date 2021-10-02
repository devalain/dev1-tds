/*
 * 
 * HE2B-ESI (2021-2022)
 * 
 */
package g58446.dev1.td3;
import java.util.Scanner;
/**
 *
 * @author g58446
 */
public class Exercice01 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez votre âge: ");
        int nombre = clavier.nextInt();
        
        if (nombre >= 18) {
            System.out.println("Vous êtes majeur");
        }
    }
}