package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class Calc {
    public static void letsPlay() {
        String message = "What is the result of the expression?";
        char[] operators = {'+', '-', '*'};
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < 3; i++) {
            int a = random.nextInt(-10, 11);
            int b = random.nextInt(-10, 11);
            int operatorIndex = random.nextInt(0, 3);
            int result = 0;
            switch (operatorIndex) {
                case 0: result = a + b;
                case 1: result = a - b;
                case 2: result = a * b;
                default: result = 0;
            }
            String question = String.format("%s %s %s", a, operators[operatorIndex], b);
            if (!Engine.checkAnswer(question, String.valueOf(result), i, message)) {
                break;
            }

        }
    }
}
