package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class Prime {
    private static final int LOW_BORDER = 2;
    private static final int HIGH_BORDER = 100;
    private static final int ITERATION_COUNT = 3;

    public static void letsPlay() {
        String message = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < ITERATION_COUNT; i++) {
            int number = ThreadLocalRandom.current().nextInt(LOW_BORDER, HIGH_BORDER);
            boolean isPrime = isPrime(number);
            String rightAnswer = "yes";
            if (!isPrime) {
                rightAnswer = "no";
            }
            if (!Engine.checkAnswer(String.valueOf(number), rightAnswer, i, message)) {
                break;
            }
        }

    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
