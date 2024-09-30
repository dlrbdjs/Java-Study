package race.common.util;

import static race.common.util.ConstVariable.RAND_BOUND;

public class Random {
    public int randNum(){
        java.util.Random random = new java.util.Random();
        return random.nextInt(RAND_BOUND);
    }
}
