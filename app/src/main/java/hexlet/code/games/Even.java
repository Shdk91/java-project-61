package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Even {
    public static void game() {
        Cli.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int number = ThreadLocalRandom.current().nextInt(0, 100000);
            boolean isEven = number%2 == 0;
            String rightAnswer = "yes";

            System.out.println("Question: " + number);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);

            if (!isEven) {
                rightAnswer = "no";
            }

            if (answer.equalsIgnoreCase(rightAnswer)) {
                System.out.println("Correct!");
            }  else {
                System.out.println(String.format("%s is wrong answer ;(. Correct answer was %s.\nLet's try again, %s!",
                        answer, rightAnswer, Cli.getName()));
                break;
            }
            if(i == 2) {
                System.out.println(String.format("Congratulations, %s!", Cli.getName()));
            }
        }
    }
}
