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
public class Exercice05 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un entier a:");
        int a = clavier.nextInt();
        System.out.println("Entrez un entier b:");
        int b = clavier.nextInt();
        System.out.println("Entrez un entier c:");
        int c = clavier.nextInt();
        System.out.println(a%2 == 0);   //les espaces ne dérangent pas l'opération. Les garder?
        System.out.println(a%2 == 1);
        System.out.println(a%b == 0);
        System.out.println(a < b);
        System.out.println((a <= b)&&(a <= c));
        System.out.println((a<b&&b<c)||(a>b&&b>c));
    }
}
