//Katsotaan viimeisenä
package GUI;

/**
 *
 * @author s1601396
 */
public class PisteidenLasku {

    static int kokonaisPisteet = 0;

    public static void pisteet(String kortti) {
        
        GUI.pisteet(kokonaisPisteet = kokonaisPisteet + (kortti.charAt(0)));
    }
}
