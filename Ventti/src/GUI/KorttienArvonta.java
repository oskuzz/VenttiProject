
//Tee 2 oliota jotka arpovat luvut 1 ja 13 väliltä ja toisessa 1-4 väliltä.

package GUI;

import java.util.Random;


public class KorttienArvonta {
    
    private static int showRandomInteger(int aStart, int aEnd, Random aRandom) {
        long range = (long) aEnd - (long) aStart + 1;
        long fraction = (long) (range * aRandom.nextDouble());
        int randomNumber = (int) (fraction + aStart);
        return (randomNumber);
    }
}
