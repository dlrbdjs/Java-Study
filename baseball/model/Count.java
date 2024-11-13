package baseball.model;

import baseball.common.util.Condition;
import baseball.common.util.ConstVariable;

import java.util.List;
import java.util.stream.IntStream;

public class Count {

    private int strikeCount;
    private int ballCount;

    public Count() {
        initCount();
    }

    public void initCount() {
        strikeCount = 0;
        ballCount = 0;
    }

    public int getBallCount() {
        return ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public void setStrikeCount(List<Integer> userNumbers, List<Integer> randomNumbers) {
        IntStream.range(0, ConstVariable.MAX_NUM_LIST_LENGTH)
                .filter(idx -> Condition.isSameNumber(userNumbers.get(idx), randomNumbers.get(idx)))
                .forEach(i -> strikeCount++);
    }

    public void setBallCount(List<Integer> userNumbers, List<Integer> randomNumbers) {
        IntStream.range(0, ConstVariable.MAX_NUM_LIST_LENGTH)
                .forEach(idx -> IntStream.range(0, ConstVariable.MAX_NUM_LIST_LENGTH)
                .filter(jdx -> Condition.isSameNumber(userNumbers.get(idx), randomNumbers.get(jdx)) && (jdx != idx))
                .forEach(i -> ballCount++));
    }
}
