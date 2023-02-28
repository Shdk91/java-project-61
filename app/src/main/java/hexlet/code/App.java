package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("""
                Please enter the game number and press Enter
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);

        Scanner scanner = new Scanner(System.in);

        switch (scanner.next()) {
            case "1" -> Cli.greeting();
            case "2" -> Even.letsPlay();
            case "3" -> Calc.letsPlay();
            case "4" -> GCD.letsPlay();
            case "5" -> Progression.letsPlay();
            case "6" -> Prime.letsPlay();
            default -> {
            }
        }

    }
}
