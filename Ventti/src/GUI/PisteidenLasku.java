package GUI;

/**
 *
 * @author s1601396
 */
public class PisteidenLasku {

    static int bPisteet = 0;
    static int kokonaisPisteet = 0;

    public static void pisteet(int kortti) {
        kokonaisPisteet = kokonaisPisteet + kortti;
        GUI.pisteet(kokonaisPisteet);
        if (kokonaisPisteet > 21) {
            GUI.stand();
        } else if (kokonaisPisteet == 24) {
            System.out.println("Ventti");
            GUI GUI = new GUI();
            GUI.lost();
        }
    }

    public static void bPisteet(int kortti) {
        bPisteet = bPisteet + kortti;
        
        if (bPisteet > 21) {
            
        } else if (bPisteet == 24) {
            System.out.println("Ventti");
            GUI GUI = new GUI();
            
        }
    }

    public static void reset() {
        kokonaisPisteet = 0;
        bPisteet = 0;
    }
}
