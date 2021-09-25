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
public class Exercice03 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println ("Entrez un nombre: ");
        double a = clavier.nextDouble();
        System.out.println("Entrez encore un nombre: ");
        double b = clavier.nextDouble();
        
        if (a>b){
            System.out.println("Le plus grand est" + a);
        }else{
            System.out.println("le plus grand est" + b);
        }
    }
}
