package baseball.model;

import baseball.common.util.Condition;
import baseball.common.util.ConstVariable;

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

    public void setCount(Numbers userNumbers, Numbers randomNumbers) {
        setStrikeCount(userNumbers, randomNumbers);
        setBallCount(userNumbers, randomNumbers);
    }

    private void setStrikeCount(Numbers userNumbers, Numbers randomNumbers) {
        IntStream.range(0, ConstVariable.MAX_NUM_LIST_LENGTH)
                .filter(idx -> Condition.isSameNumber(userNumbers.getNumbers().get(idx), randomNumbers.getNumbers().get(idx)))
                .forEach(_ -> strikeCount++);
    }

    private void setBallCount(Numbers userNumbers, Numbers randomNumbers) {
        IntStream.range(0, ConstVariable.MAX_NUM_LIST_LENGTH)
                .forEach(idx -> IntStream.range(0, ConstVariable.MAX_NUM_LIST_LENGTH)
                        .filter(jdx -> Condition.isSameNumber(userNumbers.getNumbers().get(idx), randomNumbers.getNumbers().get(jdx)) && !Condition.isSameNumber(jdx, idx))
                        .forEach(_ -> ballCount++));
    }
}
