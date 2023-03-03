package hexlet.code;

import java.util.concurrent.ThreadLocalRandom;

public class Utils {

    public static int getRandomInt(int lowBorder, int highBorder) {
       return ThreadLocalRandom.current().nextInt(lowBorder, highBorder);
    }

    public static int getRandomInt(int highBorder) {
        return ThreadLocalRandom.current().nextInt(highBorder);
    }
}
