package race.common.util;

public class Random {
    public int randNum() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(ConstVariable.RAND_BOUND);
    }
}
