package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class Even {
    private static final int HIGH_BORDER = 100000;
    private static final int ITERATION_COUNT = 3;

    public static void letsPlay() {
        String message = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < ITERATION_COUNT; i++) {
            int number = ThreadLocalRandom.current().nextInt(HIGH_BORDER);
            boolean isEven = number % 2 == 0;
            String rightAnswer = "yes";
            if (!isEven) {
                rightAnswer = "no";
            }
            if (!Engine.checkAnswer(String.valueOf(number), rightAnswer, i, message)) {
                break;
            }
        }
    }
}
