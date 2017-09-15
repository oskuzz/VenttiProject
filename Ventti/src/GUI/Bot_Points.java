/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author s1601396
 */
public class Bot_Points {
    static int bPisteet = 0;
    static int kokonaisPisteet = 0;

    public static void pisteet(int kortti) {
        kokonaisPisteet = kokonaisPisteet + kortti;
        GUI.pisteet(kokonaisPisteet, 1);
        if (kokonaisPisteet > 21) {
            GUI.stand();
        } else if (kokonaisPisteet == 21) {
            System.out.println("Ventti");
            GUI GUI = new GUI();
            GUI.Stand.doClick();
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
