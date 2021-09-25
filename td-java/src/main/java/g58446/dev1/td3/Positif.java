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
public class Positif {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        
        System.out.print("Entrez un nombre entier: ");
        int nb = clavier.nextInt();
        if(nb>=0) {
            System.out.println("Ce nombre est positif");
        }
    }
}
  