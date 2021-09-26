/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g58446.tad.dev1.td3;
import  java.util.Scanner;
/**
 *
 * @author Ced
 */
public class Exercice06 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un premier nombre:");
        double n1 = clavier.nextDouble();
        System.out.println("Entrez un deuxième nombre:");
        double n2 = clavier.nextDouble();
        System.out.println("Entrez un troisième nombre:");
        double n3 = clavier.nextDouble();
        
        if (n1>n2&&n1>n3) {
            System.out.println("Le plus grand est " + n1);
        }else{
            if(n2>n1&&n2>n3){
                System.out.println("Le plus grand est " + n2);
        }else{
                System.out.println("Le plus grand est " + n3);
        }
        
    }
}}        //à corriger : 3 3 2

