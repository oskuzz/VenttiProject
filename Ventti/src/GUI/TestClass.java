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

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
            String kortti = lukija.next();
            KorttienTarkistaminen.firstCard(kortti);
        for (int i = 0; i < 5; i++) {
            kortti = lukija.next();

            System.out.println(KorttienTarkistaminen.cardTest(kortti));
        }
    }
}
