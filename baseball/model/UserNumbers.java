package baseball.model;

import baseball.common.util.Condition;
import baseball.view.ErrorMessage;

import java.util.List;
import java.util.stream.IntStream;

public class UserNumbers extends Numbers{

    public void setNumbers(String inputNums) {
        checkUserInput(inputNums);
        getNumbers().clear();
        convertInputToNumber(inputNums);
        checkUserNumbers(getNumbers());
    }

    private void checkUserInput(String inputNums){
        try {
            validateUserInputLength(inputNums);
        } catch (IndexOutOfBoundsException e) {
            ErrorMessage.INPUT_ERROR_LENGTH.println();
            throw new IndexOutOfBoundsException();
        }
    }

    private void convertInputToNumber(String inputNums){
        try {
            IntStream.range(0, inputNums.length())
                    .forEach(idx -> getNumbers().add(Integer.parseInt(String.valueOf(inputNums.charAt(idx)))));
        } catch (NumberFormatException e) {
            ErrorMessage.INPUT_ERROR_TYPE.println();
            throw new NumberFormatException();
        }
    }

    private void checkUserNumbers(List<Integer> numbers) {
        try {
            validateUserNumbers(numbers);
        } catch (IllegalArgumentException e) {
            ErrorMessage.INPUT_ERROR_SAME.println();
            throw new IndexOutOfBoundsException();
        }
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
