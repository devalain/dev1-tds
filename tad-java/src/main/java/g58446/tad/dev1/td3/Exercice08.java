/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g58446.tad.dev1.td3;

/**
 *
 * @author Ced
 */
public class Exercice08 {
    public static void main(String[] args) {
        System.out.println(9.99 == 10.0);
        System.out.println(9.999999999999999999999999 == 10.0);
        System.out.println(9.999999999999999999999999 == 10.00000000000001);
        System.out.println(true);
        System.out.println(false);
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(true && true);
        System.out.println(true && false );
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
    }
}
