package race.common.util;

import java.util.List;

public class Condition {
    public static boolean isBiggerThanFour() {
        Random random = new Random();
        return random.randNum() >= ConstVariable.MOVE_CONDITION_VALUE_FOUR;
    }

    public static boolean isSameNumber(int carDist, int carsDist) {
        return carDist == carsDist;
    }

    public static boolean isMoreThanFiveLetters(String str) {
        return str.length() > ConstVariable.MAX_NAME_LENGTH;
    }

    public static boolean isFrontSpace(String str) {
        return str.charAt(0) == ' ';
    }

    public static boolean isSameString(List<String> cars) {
        return cars.size() != cars.stream()
                .distinct()
                .count();
    }
}
