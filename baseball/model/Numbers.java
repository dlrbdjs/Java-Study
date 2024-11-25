package baseball.model;

import baseball.common.util.Condition;
import baseball.common.util.ConstVariable;
import baseball.common.util.RandomNumber;
import baseball.view.ErrorMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Numbers {
    private List<Integer> numbers;

    public Numbers() {
        this.numbers = new ArrayList<>();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    private int getSingleDigit(int idx) {
        int digit = numbers.get(idx % numbers.size());
        numbers.remove(idx % numbers.size());
        return digit;
    }

    public void setNumbers(String inputNums) {
        try {
            validateUserInputLength(inputNums);
        } catch (IndexOutOfBoundsException e) {
            ErrorMessage.INPUT_ERROR_LENGTH.println();
            throw new IndexOutOfBoundsException();
        }
        numbers.clear();
        try {
            IntStream.range(0, inputNums.length())
                    .forEach(idx -> numbers.add(Integer.parseInt(String.valueOf(inputNums.charAt(idx)))));
        } catch (NumberFormatException e) {
            ErrorMessage.INPUT_ERROR_TYPE.println();
            throw new NumberFormatException();
        }
        try {
            validateUserNumbers(numbers);
        } catch (IllegalArgumentException e) {
            ErrorMessage.INPUT_ERROR_SAME.println();
            throw new IndexOutOfBoundsException();
        }
    }

    public void setNumbers() {
        Numbers singleDigits = new Numbers();
        singleDigits.initSingleDigits();
        numbers.clear();
        for (int i = 0; i < ConstVariable.MAX_NUM_LIST_LENGTH; i++) {
            numbers.add(singleDigits.getSingleDigit(RandomNumber.getRandomNumber()));
        }
    }

    public void initSingleDigits() {
        this.numbers = new ArrayList<>(ConstVariable.SINGLE_DIGITS);
    }

    private void validateUserInputLength(String inputNumbers) {
        if (!Condition.isMaxLength(inputNumbers)) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void validateUserNumbers(List<Integer> numbers) {
        if (!Condition.isDistinctThreeDigits(numbers)) {
            throw new IllegalArgumentException();
        }
    }
}
