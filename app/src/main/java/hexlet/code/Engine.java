package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ITERATION_COUNT = 3;

    public static void processGame(String[][] gameData, String rule) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(rule);

        for (int i = 0; i < ITERATION_COUNT; i++) {
            String question = gameData[i][0];
            String correctAnswer = gameData[i][1];
            System.out.println("Question: " + question);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (answer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("%s is wrong answer ;(. Correct answer was %s.\nLet's try again, %s!%n",
                        answer, correctAnswer, name);
                return;
            }
        }
        System.out.printf("Congratulations, %s!%n", name);
    }
}
