package baseball.model;

import baseball.common.util.Condition;
import baseball.common.util.ConstVariable;
import baseball.common.util.RandomNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Numbers {
    private List<Integer> userNumbers;
    private List<Integer> randomNumbers;
    private List<Integer> singleDigits;

    public Numbers() {
        initSingleDigits();
    }

    public List<Integer> getRandomNumbers() {
        return randomNumbers;
    }

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    public void getSingleDigit(int idx) {
        addRandomNumbers(singleDigits.get(idx % singleDigits.size()));
        singleDigits.remove(idx % singleDigits.size());
    }

    public void setUserNumbers(String inputNums) {
        validateUserInputLength(inputNums);
        userNumbers = new ArrayList<>();
        IntStream.range(0, inputNums.length())
                .forEach(idx -> userNumbers.add(Integer.parseInt(String.valueOf(inputNums.charAt(idx)))));
        validateUserNumbers(userNumbers);
    }

    public void setRandomNumbers() {
        randomNumbers = new ArrayList<>();
        for (int i = 0; i < ConstVariable.MAX_NUM_LIST_LENGTH; i++) {
            getSingleDigit(RandomNumber.getRandomNumber());
        }
    }

    public void initSingleDigits() {
        this.singleDigits = ConstVariable.SINGLE_DIGITS;
    }

    public void addRandomNumbers(int randomNumber) {
        this.randomNumbers.add(randomNumber);
    }

    public void validateUserInputLength (String inputNumbers){
        if(!Condition.isMaxLength(inputNumbers)){
            throw new IndexOutOfBoundsException();
        }
    }
    public void validateUserNumbers (List<Integer> userNumbers){
        if(!Condition.isDistinctThreeDigits(userNumbers)){
            throw new IllegalArgumentException();
        }
    }
}
