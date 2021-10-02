/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev1.javl.test2;
import java.util.Scanner;
/**
 *
 * @author g58446
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la longueur du rectangle: ");
        double longueur = sc.nextDouble();
        System.out.println("Entrez la largeur du rectange: ");
        double largeur = sc.nextDouble();
        System.out.println("L'aire du rectangle est :" + longueur*largeur);
    }
}
