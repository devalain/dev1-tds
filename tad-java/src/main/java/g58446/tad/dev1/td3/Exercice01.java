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
public class Exercice01 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);          // création d'une instance de lA classe Scanner
        System.out.println("Entrez votre âge: ");
        int nombre = clavier.nextInt();
        if (nombre >= 18) {
            System.out.println("Vous êtes majeur");
        }
    }
}
