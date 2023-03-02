package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class GCD {
    private static final int LOW_BORDER = 1;
    private static final int HIGH_BORDER = 101;
    private static final String RULE = "Find the greatest common divisor of given numbers.";

    public static void letsPlay() {
        Engine.processGame(createGameData(), RULE);
    }

    private static String[][] createGameData() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        String[][] gameData = new String[Engine.ITERATION_COUNT][2];
        for (int i = 0; i < Engine.ITERATION_COUNT; i++) {
            int a = random.nextInt(LOW_BORDER, HIGH_BORDER);
            int b = random.nextInt(LOW_BORDER, HIGH_BORDER);
            int result = getGCD(a, b);
            String question = a + " " + b;
            gameData[i][0] = question;
            gameData[i][1] = String.valueOf(result);
        }
        return gameData;
    }

    private static int getGCD(int first, int second) {
        while (second != 0) {
            int tmp = first % second;
            first = second;
            second = tmp;
        }
        return first;
    }
}
