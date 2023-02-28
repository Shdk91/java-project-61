package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class Even {
    public static void letsPlay() {
        String message = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < 3; i++) {
            int number = ThreadLocalRandom.current().nextInt(0, 100000);
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
