/*
 *  HE2B-ESI (2021-2022)
 */
package g58446.dev1.td4;

import java.util.Scanner;

/**
 *
 * @author g58446
 */
public class Exercice10bis {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez une série de nombres positifs (entrez -1 pour terminer): ");
        int valeur = clavier.nextInt();
        int premier = valeur;
        final int sentinelle = -1;
        int dernier = premier;

        if (valeur == sentinelle) {
            System.out.println("La série est vide");
        } else {
            while (valeur > sentinelle) {
                System.out.println("Entrez un autre nombre: ");
                /*
                Ici, on assigne valeur à dernier inutilement à la première itération
                On pourrait réinverser l'assignation et la lecture au clavier dans
                un "do-while"
                 */
                dernier = valeur;
                valeur = clavier.nextInt();
            }

            if (premier < dernier) {
                System.out.println("Le premier est inférieur au dernier");
            } else if (premier == dernier) {
                System.out.println("Le premier est égal au dernier");
            } else if (premier > dernier) { /*on devrait supprimer cette condition
                                            car elle est déja satisfaite
                                             */
                System.out.println("Le premier est supérieur au dernier");
            }
        }
    }
}
