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
                break;
            case 2:
                if (card.equals(card1)) {
                    return 1;
                } else {
                    card2 = card;
                    break;
                }
            case 3:
                if (card.equals(card1)) {
                    return 1;
                } else if (card.equals(card2)) {
                    return 1;
                } else {
                    card3 = card;
                    break;
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
                    break;
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
                    break;
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
                    break;
                }
            case 7:
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
                } else if (card.equals(card6)) {
                    return 1;
                } else {
                    card7 = card;
                    break;
                }
            case 8:
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
                } else if (card.equals(card6)) {
                    return 1;
                } else if (card.equals(card7)) {
                    return 1;
                } else {
                    card8 = card;
                    break;
                }
            case 9:
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
                } else if (card.equals(card6)) {
                    return 1;
                } else if (card.equals(card7)) {
                    return 1;
                } else if (card.equals(card8)) {
                    return 1;
                } else {
                    card9 = card;
                    break;
                }
            case 10:
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
                } else if (card.equals(card6)) {
                    return 1;
                } else if (card.equals(card7)) {
                    return 1;
                } else if (card.equals(card8)) {
                    return 1;
                } else if (card.equals(card9)) {
                    return 1;
                } else {
                    card10 = card;
                    break;
                }
            case 11:
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
                } else if (card.equals(card6)) {
                    return 1;
                } else if (card.equals(card7)) {
                    return 1;
                } else if (card.equals(card8)) {
                    return 1;
                } else if (card.equals(card9)) {
                    return 1;
                } else if (card.equals(card10)) {
                    return 1;
                } else {
                    card11 = card;
                    break;
                }
        }
        return 0;
    }
}
