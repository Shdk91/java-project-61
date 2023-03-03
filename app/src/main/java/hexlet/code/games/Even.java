package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int HIGH_BORDER = 100000;
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void letsPlay() {
        Engine.processGame(createGameData(), RULE);
    }

    private static String[][] createGameData() {
        String[][] gameData = new String[Engine.ITERATION_COUNT][2];
        for (int i = 0; i < Engine.ITERATION_COUNT; i++) {
            int number = Utils.getRandomInt(HIGH_BORDER);
            boolean isEven = isEven(number);
            String rightAnswer = isEven ? "yes" : "no";
            gameData[i][0] = String.valueOf(number);
            gameData[i][1] = rightAnswer;
        }
        return gameData;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
