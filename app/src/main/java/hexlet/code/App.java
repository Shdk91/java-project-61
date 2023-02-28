package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("""
                Please enter the game number and press Enter
                1 - Greet
                2 - Even
                0 - Exit
                """);

        Scanner scanner = new Scanner(System.in);

        switch (scanner.next()) {
            case "1" -> Cli.greeting();
            case "2" -> Even.game();
            default -> {
            }
        }

    }
}
