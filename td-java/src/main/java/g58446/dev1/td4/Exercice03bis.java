/*
 *  HE2B-ESI (2021-2022)
 */
package g58446.dev1.td4;
import java.util.Scanner;
/**
 *
 * @author g58446
 */
public class Exercice03bis {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        double somme = 0;
        int nbValeurs = 0;
        
        System.out.println("Entrez 5 valeurs: ");
        while (nbValeurs < 5) {
            double valeur = clavier.nextDouble();
            somme = somme + valeur;
            nbValeurs = nbValeurs + 1;
        }
        
        double moyenne = somme / nbValeurs;     // en soi, pas besoin de déclarer la moyenne (voir Exercice03)
        System.out.println("La somme de ces valeurs est" + somme);
        System.out.println("La moyenne de ces valeurs est " + moyenne); 
        
    }
}
