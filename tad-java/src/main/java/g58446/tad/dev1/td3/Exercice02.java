/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g58446.tad.dev1.td3;
import java.util.Scanner;
/**
 *
 * @author Ced
 */
public class Exercice02 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner (System.in);
        System.out.println("Entrez un nombre entier:");
        int nombre = clavier.nextInt();
            if (nombre%2 == 0) {
                System.out.println("Ce nombre est pair"); //Pourquoi n'ai je pas besoin de d'accolade pour le "else"?
            }else{    System.out.println("Ce nombre est impair"); // j'ai remis les accolades mais ça marchait avant de regrouper tout dans "if"
        
            }
    }
}

/* Alain, comment organiser correctement mes lignes ? */