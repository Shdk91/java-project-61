package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class GCD {
    private static final int LOW_BORDER = 1;
    private static final int HIGH_BORDER = 101;
    private static final int ITERATION_COUNT = 3;

    public static void letsPlay() {
        String message = "Find the greatest common divisor of given numbers.";
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < ITERATION_COUNT; i++) {

            int a = random.nextInt(LOW_BORDER, HIGH_BORDER);
            int b = random.nextInt(LOW_BORDER, HIGH_BORDER);
            int result = getGCD(a, b);
            String question = a + " " + b;
            if (!Engine.checkAnswer(question, String.valueOf(result), i, message)) {
                break;
            }
        }
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
