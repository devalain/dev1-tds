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
public class Exercice03 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre:");
        int nombre1 = clavier.nextInt();
        System.out.println("Entrez encore un nombre:");
        int nombre2 = clavier.nextInt();
        if (nombre1 > nombre2){
            System.out.println("Le nombre le plus grand est " + nombre1);
        }else{                                                                   
            System.out.println("Le nombre le plus grand est " + nombre2);       
        }
    }
}
