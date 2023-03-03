package hexlet.code.games;

import hexlet.code.Engine;

import java.util.concurrent.ThreadLocalRandom;

public class Progression {
    private static final int LOW_BORDER_TO_STEP = 2;
    private static final int HIGH_BORDER_TO_STEP = 6;
    private static final int HIGH_BORDER_TO_FIRST_MEMBER = 20;
    private static final int PROGRESSION_LENGTH = 10;
    private static final String RULE = "What number is missing in the progression?";

    public static void letsPlay() {
        Engine.processGame(createGameData(), RULE);
    }

    private static String[][] createGameData() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        String[][] gameData = new String[Engine.ITERATION_COUNT][2];

        for (int i = 0; i < Engine.ITERATION_COUNT; i++) {
            int step = random.nextInt(LOW_BORDER_TO_STEP, HIGH_BORDER_TO_STEP);
            int firstMember = random.nextInt(HIGH_BORDER_TO_FIRST_MEMBER);
            int[] progression = createProgression(PROGRESSION_LENGTH, firstMember, step);
            int missMemberIndex = random.nextInt(progression.length);

            StringBuilder question = new StringBuilder();
            for (int j = 0; j < progression.length; j++) {
                if (j != missMemberIndex) {
                    question.append(progression[j]).append(" ");
                } else {
                    question.append(".. ");
                }
            }

            gameData[i][0] = question.toString();
            gameData[i][1] = String.valueOf(progression[missMemberIndex]);
        }
        return gameData;
    }

    private static int[] createProgression(int progressionLength, int firstMember, int step) {
        int[] progression = new int[progressionLength];
        for (int i = 1; i < progressionLength; i++) {
            progression[i] = firstMember + step * i;
        }
        return progression;
    }
}
