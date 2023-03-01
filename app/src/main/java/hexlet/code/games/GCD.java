package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class GCD {
    public static void letsPlay() {
        String message = "Find the greatest common divisor of given numbers.";
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < 3; i++) {
            int lowBorder = 1;
            int highBorder = 101;
            int a = random.nextInt(lowBorder, highBorder);
            int b = random.nextInt(lowBorder, highBorder);
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
