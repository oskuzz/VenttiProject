// Tee olio joka tarkistaa onko kortti jo käytössä. Jos on palauta arvo true. jos ei palauta arvo false.
package GUI;

import java.util.ArrayList;

/**
 *
 * @author s1601396
 */
public class KorttienTarkistaminen {

    public static boolean cardTest(String card) {
        ArrayList<String> cards = new ArrayList<>();

        if (!cards.isEmpty()) {
            for (int i = 0; i < cards.size(); i++) {
                
                if(cards.get(i).equals(card)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
