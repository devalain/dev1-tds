/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g58446.dev1.td2;
import java.util.Scanner;
/**
 *
 * @author Ced
 */
public class Exercice06 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int nb;
        
        System.out.println("Entrez un entier: ");
        nb = clavier.nextInt ();
        
        System.out.println((nb%10) + " - les unités" );
        System.out.println((nb/10)%10 + " - les dizaines" );
        System.out.println((nb/100)%10 + " - les centaines" );
        
        
    }
}
