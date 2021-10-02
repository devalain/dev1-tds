/*
 *  HE2B-ESI (2021-2022)
 */
package g58446.dev1.td4;
import java.util.Scanner;
/**
 *
 * @author g58446
 */
public class Exercice02 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
     
        System.out.println("Entrez la longueur de la ligne: ");
        int segments = clavier.nextInt();
        int compteur = 1;
        
        while (compteur <= segments) {
            System.out.print("-");
            compteur = compteur + 1;
        }
        
        
        
        
    }
}
