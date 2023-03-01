package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class Progression {
    private static final int LOW_BORDER_TO_STEP = 2;
    private static final int HIGH_BORDER_TO_STEP = 6;
    private static final int HIGH_BORDER_TO_FIRST_MEMBER = 20;
    private static final int ITERATION_COUNT = 3;
    private static final int PROGRESSION_LENGTH = 10;

    public static void letsPlay() {
        String message = "What number is missing in the progression?";
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < ITERATION_COUNT; i++) {
            int[] progression = new int[PROGRESSION_LENGTH];
            int missMember = random.nextInt(progression.length);
            int step = random.nextInt(LOW_BORDER_TO_STEP, HIGH_BORDER_TO_STEP);
            StringBuilder question = new StringBuilder();

            for (int j = 0; j < progression.length; j++) {
                if (j == 0) {
                    progression[j] = random.nextInt(HIGH_BORDER_TO_FIRST_MEMBER);
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
