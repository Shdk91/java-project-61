package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.concurrent.ThreadLocalRandom;

public class Prime {
    private static final int LOW_BORDER = 1;
    private static final int HIGH_BORDER = 100;
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";


    public static void letsPlay() {
        Engine.processGame(createGameData(), RULE);
    }

    private static String[][] createGameData() {
        String[][] gameData = new String[Engine.ITERATION_COUNT][2];
        for (int i = 0; i < Engine.ITERATION_COUNT; i++) {
            int number = Utils.getRandomInt(LOW_BORDER, HIGH_BORDER);
            boolean isPrime = isPrime(number);
            String rightAnswer = isPrime? "yes" : "no";
            gameData[i][0] = String.valueOf(number);
            gameData[i][1] = rightAnswer;
        }
        return gameData;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
