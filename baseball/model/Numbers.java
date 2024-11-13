package baseball.model;

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

    public void initUserNums(String inputNums) {
        userNumbers = new ArrayList<>();
        IntStream.range(0, inputNums.length())
                .forEach(idx -> userNumbers.add(Character.getNumericValue(inputNums.charAt(idx))));
    }

    public void initRandomNumbers() {
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
}
