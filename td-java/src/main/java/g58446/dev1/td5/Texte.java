/*
 * 
 * HE2B-ESI (2021-2022)
 * 
 */
package g58446.dev1.td5;

import java.util.Scanner;
/**
 *
 * @author g58446
 */
public class Texte {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        String texte = clavier.nextLine(); //lit du texte au clavier
        
        System.out.println(texte);
        System.out.println("Le texte entré est" + texte);
        
        int longueur = texte.length();  //le nombre de caractères
        System.out.println("la longueur entré est: " + longueur);
        
        char premièreLettre = texte.charAt(0);
        char dernièreLettre = texte.charAt(longueur-1);
        System.out.println(premièreLettre);
        System.out.println(dernièreLettre);
        
        for(int i=0; i < texte.length(); i++) { //parcours la chaine de caractères
           System.out.println(texte.charAt(i));
        }
    }
}
