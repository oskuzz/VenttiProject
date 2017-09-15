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
        GUI.pisteet(kokonaisPisteet, 0);
        if (kokonaisPisteet > 21) {
            GUI.stand();
        } else if (kokonaisPisteet == 21) {
            System.out.println("Ventti");
            GUI GUI = new GUI();
            GUI.stand();
            GUI.bot();
            
        }
    }

    public static void reset() {
        kokonaisPisteet = 0;
        bPisteet = 0;
    }
    
    public static int getPisteet(){
        return kokonaisPisteet;
    }
}
