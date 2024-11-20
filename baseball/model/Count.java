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
        strikeCount = ConstVariable.INIT_STRIKE_COUNT;
        ballCount = ConstVariable.INIT_BALL_COUNT;
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
                .forEach(_ -> strikeCount++);
    }

    public void setBallCount(List<Integer> userNumbers, List<Integer> randomNumbers) {
        IntStream.range(0, ConstVariable.MAX_NUM_LIST_LENGTH)
                    .forEach(idx -> IntStream.range(0, ConstVariable.MAX_NUM_LIST_LENGTH)
                    .filter(jdx -> Condition.isSameNumber(userNumbers.get(idx), randomNumbers.get(jdx)) && !Condition.isSameNumber(jdx, idx))
                    .forEach(_ -> ballCount++));
    }
}
