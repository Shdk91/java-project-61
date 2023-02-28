package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class Progression {
    public static void letsPlay() {
        String message = "What number is missing in the progression?";
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < 3; i++) {
            int[] progression = new int[10];
            int missMember = random.nextInt(0, 10);
            int step = random.nextInt(2, 6);
            StringBuilder question = new StringBuilder();

            for (int j = 0; j < progression.length; j++) {
                if (j == 0) {
                    progression[j] = random.nextInt(0, 20);
                } else {
                    progression[j] = progression[j - 1] + step;
                }
                if (j != missMember) {
                    question.append(progression[j]).append(" ");
                } else {
                    question.append(".. ");
                }
            }

            if (!Engine.checkAnswer(question.toString(), String.valueOf(progression[missMember]), i, message)) {
                break;
            }
        }
    }
}
