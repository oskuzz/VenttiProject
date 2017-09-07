// Tee olio joka tarkistaa onko kortti jo käytössä. Jos on palauta arvo true. jos ei palauta arvo false.
package GUI;

import java.util.ArrayList;

/**
 *
 * @author s1601396
 */
public class KorttienTarkistaminen {

    static String card1 = "";
    static String card2 = "";
    static String card3 = "";
    static String card4 = "";
    static String card5 = "";
    static String card6 = "";
    static String card7 = "";
    static String card8 = "";
    static String card9 = "";
    static String card10 = "";
    static String card11 = "";

    public static int cardTest(int Card, String card) {
        switch (Card) {
            case 1:
                card1 = card;
                return 0;
            case 2:
                if (card.equals(card1)) {
                    return 1;
                } else {
                    card2 = card;
                    return 0;
                }
            case 3:
                if (card.equals(card1)) {
                    return 1;
                } else if (card.equals(card2)) {
                    return 1;
                } else {
                    card3 = card;
                }
            case 4:
                if (card.equals(card1)) {
                    return 1;
                } else if (card.equals(card2)) {
                    return 1;
                } else if (card.equals(card3)) {
                    return 1;
                } else {
                    card4 = card;
                }
            case 5:
                if (card.equals(card1)) {
                    return 1;
                } else if (card.equals(card2)) {
                    return 1;
                } else if (card.equals(card3)) {
                    return 1;
                } else if (card.equals(card4)) {
                    return 1;
                } else {
                    card5 = card;
                }
            case 6:
                if (card.equals(card1)) {
                    return 1;
                } else if (card.equals(card2)) {
                    return 1;
                } else if (card.equals(card3)) {
                    return 1;
                } else if (card.equals(card4)) {
                    return 1;
                } else if (card.equals(card5)) {
                    return 1;
                } else {
                    card6 = card;
                }

        }
        return 0;
    }

    public static void firstCard(String card) {

    }
}
