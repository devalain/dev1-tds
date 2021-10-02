/*
 *  HE2B-ESI (2021-2022)
 */
package g58446.dev1.td5;

import java.util.Scanner;

/**
 *
 * @author g58446
 */
public class Exercice01 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre entier n: ");
        int n = clavier.nextInt();
        System.out.println("Les nombres entiers de 1 à " + n);

        for (int i=1;i<=n;i++) {
            System.out.println(i);
        }
    }
}