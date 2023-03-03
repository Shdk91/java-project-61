package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.concurrent.ThreadLocalRandom;

public class Calc {
    private static final int LOW_BORDER = -11;
    private static final int HIGH_BORDER = 10;
    private static final String RULE = "What is the result of the expression?";

    public static void letsPlay() {
        Engine.processGame(createGameData(), RULE);
    }

    private static String[][] createGameData() {
        char[] operators = {'+', '-', '*'};
        String[][] gameData = new String[Engine.ITERATION_COUNT][2];

        for (int i = 0; i < Engine.ITERATION_COUNT; i++) {
            int a = Utils.getRandomInt(LOW_BORDER, HIGH_BORDER);
            int b = Utils.getRandomInt(LOW_BORDER, HIGH_BORDER);
            char operator = operators[Utils.getRandomInt(operators.length)];
            int result = calculate(a, b, operator);
            String question = String.format("%s %s %s", a, operator, b);
            gameData[i][0] = question;
            gameData[i][1] = String.valueOf(result);
        }
        return gameData;
    }

    private static int calculate(int first, int second, char operator) {
        switch (operator) {
            case '+' -> {
                return first + second;
            }
            case '-' -> {
                return first - second;
            }
            case '*' -> {
                return first * second;
            }
            default ->
                throw new UnsupportedOperationException("Current operator is not support:" + operator);

        }
    }
}
