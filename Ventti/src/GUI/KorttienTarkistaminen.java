// Tee olio joka tarkistaa onko kortti jo käytössä. Jos on palauta arvo true. jos ei palauta arvo false.
package GUI;

import java.util.ArrayList;

/**
 *
 * @author s1601396
 */
public class KorttienTarkistaminen {

    static ArrayList<String> cards = new ArrayList<>();

    public static boolean cardTest(String card) {
        
        for (int i = 0; i < cards.size(); i++) {

            if (cards.get(i).equals(card)) {
                return true;
            } else {
                cards.add(card);
                return false;
            }
        }
        return false;
    }
    
    public static void firstCard(String card){
        cards.add(card);
    }
}
