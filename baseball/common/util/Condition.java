package baseball.common.util;

import java.util.List;

public class Condition {
    public static boolean isSameNumber(int num1, int num2) {
        return num1 == num2;
    }

    public static boolean isZero(int num) {
        return num == 0;
    }

    public static boolean isThree(int num1) {
        return num1 == 3;
    }

    public static boolean isMaxLength(String numbers){
        return numbers.length() == ConstVariable.MAX_NUM_LIST_LENGTH;
    }

    public static boolean isDistinctThreeDigits(List<Integer> numbers) {
        return numbers.stream().distinct().count() == ConstVariable.MAX_NUM_LIST_LENGTH;
    }
}
