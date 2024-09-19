package race.model;

import java.util.Random;

import static race.common.util.ConstVariable.RAND_BOUND;
import static race.common.util.ConstVariable.MOVE_CONDITION_VALUE;

public class Number {
    public boolean isPossibleToMove(){
        return getRandNum() >= MOVE_CONDITION_VALUE;
    }

    public int getRandNum(){
        Random random = new Random();
        return random.nextInt(RAND_BOUND);
    }
}
