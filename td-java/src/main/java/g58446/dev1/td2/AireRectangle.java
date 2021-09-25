/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g58446.dev1.td2;

import java.util.Scanner;
/**
 *
 * @author g58446
 */
public class AireRectangle {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez la longueur");
        int longueur = clavier.nextInt();
        System.out.println("Entrez la largeur");
        int largeur = clavier.nextInt();
        System.out.print("L'aire du rectangle est "+(longueur*largeur));
       
    }
}

/* Question possible d'exam :
quel est la différence entre un type primitif et un type référece*/
 