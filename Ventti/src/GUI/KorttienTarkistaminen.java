// Tee olio joka tarkistaa onko kortti jo käytössä. Jos on palauta arvo true. jos ei palauta arvo false.
package GUI;

import java.util.ArrayList;


/**
 *
 * @author s1601396
 */
public class KorttienTarkistaminen {

    static ArrayList<String> cards = new ArrayList<>();
    static int luku = 0;
    static boolean olemassaoleva = false;

    public static int cardTest(String card) {
        System.out.println("Tarkasteltava kortti: " + card);
        cards.add("1_1");
        luku++;
        for (int i = 0; i < cards.size(); i++) {

            if (!card.equals(cards.get(i))) {
                System.out.println("Done!");
                cards.add(card);
                olemassaoleva = false;
                break;
            } else {
                System.out.println("Not Done!");
                olemassaoleva = true;
                break;
            }
        }
        if (olemassaoleva) {
            return 1;
        } else if (!olemassaoleva) {
            return 0;
        }
        return 0;
    }

    public static void firstCard(String card) {
        System.out.println("Ensimmäinen kortti: " + card);
        cards.add(card);
    }
}
