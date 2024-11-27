package baseball.common.util;

import java.util.List;

public class Condition {
    public static boolean isSameNumber(int number1, int number2) {
        return number1 == number2;
    }

    public static boolean isZero(int number) {
        return number == 0;
    }

    public static boolean isThree(int number) {
        return number == 3;
    }

    public static boolean isMaxLength(String numbers){
        return numbers.length() == ConstVariable.MAX_NUM_LIST_LENGTH;
    }

    public static boolean isDistinctDigits(List<Integer> numbers) {
        return numbers.stream().distinct().count() == numbers.size();
    }
}
