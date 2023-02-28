package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static boolean checkAnswer(String question, String correctAnswer, int count, String message) {
        if (count == 0) {
            Cli.greeting();
            System.out.println(message);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question: " + question);
        String answer = scanner.next();
        System.out.println("Your answer: " + answer);

        if (answer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
            if (count == 2) {
                System.out.printf("Congratulations, %s!%n", Cli.getName());
            }
            return true;
        } else {
            System.out.printf("%s is wrong answer ;(. Correct answer was %s.\nLet's try again, %s!%n",
                    answer, correctAnswer, Cli.getName());
            return false;
        }
    }
}
