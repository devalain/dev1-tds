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
public class Exercice02 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner (System.in);
        System.out.println ("Entrez un nombre entier : ");
        int nombre = clavier.nextInt();
        
        if (nombre%2 == 0){
            System.out.println("Le nombre est pair");
        }else{
            System.out.println("Le nombre est impair");
        }
                
        
    }
}
