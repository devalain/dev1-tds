/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g58446.dev1.td3;

import java.util.Scanner;

/**
 *
 * @author Ced
 */
public class Exercice07 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez la valeur d'un coté du triangle");
        double n1 = clavier.nextDouble();
        System.out.println("Entrez la valeur d'un autre coté du triangle");
        double n2 = clavier.nextDouble();
        System.out.println("Entrez la valeur du dernier coté du triangle");
        double n3 = clavier.nextDouble();

        if ((n1 == n2) && (n1 == n3)) {
            System.out.println("Le triangle est équilatéral");
        } else {
            if ((n1 != n2) && (n1 != n3)) {
                System.out.println("Le triangle est quelconque");
            } else {
                System.out.println("Le triangle est isocèle");
            }
        }

    }
}
