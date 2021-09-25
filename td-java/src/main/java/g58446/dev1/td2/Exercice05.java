package g58446.dev1.td2;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ced
 */
public class Exercice05 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int a;
        int b;
        
        System.out.println("Entrez la valeur de a:");
        a = clavier.nextInt();
        System.out.println("Entrez la valeur de b:");
        b = clavier.nextInt ();
        
        System.out.println ("a + b = "+ (a+b));
        System.out.println ("a - b = "+ (a-b));
        System.out.println ("a * b = "+ (a*b));
        System.out.println ("a / b = "+ (a/b));
        System.out.println ("a % b = "+ (a%b));
        System.out.println ("(a * b) + (b * b) = "+ (a*b+b*b));
    }
}
