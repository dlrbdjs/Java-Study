package baseball.common.util;

import java.util.Random;

public class RandomNumber {
    static Random random = new Random();

    public static int getRandomNumber() {
        return random.nextInt(ConstVariable.RANDOM_NUMBER_BOUND);
    }
}
