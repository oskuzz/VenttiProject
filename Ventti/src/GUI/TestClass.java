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

    static String card1 = "";
    static String card2 = "";

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        card1 = KorttienArvonta.Shuffle();
        KorttienTarkistaminen.firstCard(card1);
        for (int i = 0; i < 11; i++) {
            while (true) {
                card2 = KorttienArvonta.Shuffle();
                if (!KorttienTarkistaminen.cardTest(card2)) {
                    System.out.println(card2);
                    break;

                }
            }
        }

    }
}
