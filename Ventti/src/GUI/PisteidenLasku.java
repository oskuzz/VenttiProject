package GUI;

/**
 *
 * @author s1601396
 */
public class PisteidenLasku {

    static int kokonaisPisteet = 0;

    public static void pisteet(int kortti) {
        kokonaisPisteet = kokonaisPisteet + kortti;
        GUI.pisteet(kokonaisPisteet);
        if (kokonaisPisteet > 21) {
            GUI.stand();
        } else if (kokonaisPisteet == 24) {
            System.out.println("Ventti");
            GUI.stand();
        }
    }

    public static void reset() {
        kokonaisPisteet = 0;
    }
}
