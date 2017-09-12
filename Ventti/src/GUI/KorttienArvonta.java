
package GUI;

import java.util.Random;

public class KorttienArvonta {
    static int number;
    public static int ShuffleNum() {
        int START = 1;
        int END = 13;
        Random random = new Random();
        number = showRandomInteger(START, END, random);
        return (number);
    }

    public static int ShuffleGender() {
        int START = 1;
        int END = 4;
        Random random = new Random();
        int gender = showRandomInteger(START, END, random);
        return (gender);
    }
    
    public static String Shuffle() {
        return Integer.toString(ShuffleNum()) + "_" + Integer.toString(ShuffleGender());
    }

    private static int showRandomInteger(int aStart, int aEnd, Random aRandom) {
        long range = (long) aEnd - (long) aStart + 1;
        long fraction = (long) (range * aRandom.nextDouble());
        int randomNumber = (int) (fraction + aStart);
        return (randomNumber);
    }
    
    public static void pisteet() {
        PisteidenLasku.pisteet(number);
        
    }
}
