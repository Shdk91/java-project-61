package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class Prime {
    public static void letsPlay() {
        String message = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < 3; i++) {
            int lowBorder = 2;
            int highBorder = 100;
            int number = ThreadLocalRandom.current().nextInt(lowBorder, highBorder);
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
