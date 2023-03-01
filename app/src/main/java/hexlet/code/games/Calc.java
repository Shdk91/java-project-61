package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class Calc {
    public static void letsPlay() {
        String message = "What is the result of the expression?";
        char[] operators = {'+', '-', '*'};
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < 3; i++) {
            int lowBorder = -10;
            int highBorder = 11;
            int a = random.nextInt(lowBorder, highBorder);
            int b = random.nextInt(lowBorder, highBorder);
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
