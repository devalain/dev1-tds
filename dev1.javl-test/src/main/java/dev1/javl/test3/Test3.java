/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev1.javl.test3;

import java.util.Scanner;
/**
 *
 * @author g58446
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre entier: ");
        int valeur  = clavier.nextInt(); 
        if (valeur % 2 == 00) {
            System.out.println("Le nombre est pair");
        } else {
            System.out.println("Le nombre est impair");
            
        }   
    }
}
