/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Scanner;

/**
 *
 * @author s1601396
 */
public class TestClass {

    static String card = "";
    static int kortit = 0;

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.println(kortit);
            card = lukija.next();

            if (KorttienTarkistaminen.cardTest(card) == 0) {
                kortit++;
            }
        }
    }
}
