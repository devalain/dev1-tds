/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g58446.dev1.td3;
import java.util.Scanner;
/**
 *
 * @author g58446
 */
public class Exercice05 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner (System.in);
        
        System.out.println ("Entrez un nombre entier : ");
        int a = clavier.nextInt();
        System.out.println ("Entrez un nombre entier : ");
        int b = clavier.nextInt();
        System.out.println ("Entrez encore un nombre entier : ");
        int c = clavier.nextInt();
        System.out.println(a%2 == 0);
        System.out.println(a%2 == 1);
        System.out.println(a%b == 0);
        System.out.println(a<b);
        System.out.println((a<=b)&&(a<=c));
    }
}
