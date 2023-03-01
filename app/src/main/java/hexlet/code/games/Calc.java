package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class Calc {
    private static final int LOW_BORDER = -11;
    private static final int HIGH_BORDER = 10;
    private static final int ITERATION_COUNT = 3;

    public static void letsPlay() {
        String message = "What is the result of the expression?";
        char[] operators = {'+', '-', '*'};
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < ITERATION_COUNT; i++) {
            int a = random.nextInt(LOW_BORDER, HIGH_BORDER);
            int b = random.nextInt(LOW_BORDER, HIGH_BORDER);
            int operatorIndex = random.nextInt(operators.length);
            int result = 0;
            switch (operatorIndex) {
                case 0:
                    result = a + b;
                    break;
                case 1:
                    result = a - b;
                    break;
                case 2:
                    result = a * b;
                    break;
                default:
            }
            String question = String.format("%s %s %s", a, operators[operatorIndex], b);
            if (!Engine.checkAnswer(question, String.valueOf(result), i, message)) {
                break;
            }

        }
    }
}
