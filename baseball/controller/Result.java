package baseball.controller;

import baseball.common.util.Condition;
import baseball.model.Count;
import baseball.model.Numbers;
import baseball.view.Message;
import baseball.model.Status;
import baseball.view.UserInput;

public class Result {

    Status status = new Status();
    Count count = new Count();

    public void baseBall(Numbers userNumbers, Numbers randomNumbers) {
        count.setStrikeCount(userNumbers, randomNumbers);
        count.setBallCount(userNumbers, randomNumbers);
        baseBallResult(count.getStrikeCount(), count.getBallCount());
        count.initCount();
    }

    private void baseBallResult(int strikeCount, int ballCount) {
        if (Condition.isZero(strikeCount) && Condition.isZero(ballCount)) {
            Message.NOTHING.print();
        }

        if (!Condition.isZero(ballCount)) {
            Message.BALL.print(ballCount);
        }

        if (!Condition.isZero(strikeCount)) {
            Message.STRIKE.print(strikeCount);
        }

        if (Condition.isThree(strikeCount)) {
            UserInput userInput = new UserInput();

            System.out.println();
            Message.END_GAME.println();
            Message.RESTART_GAME.println();

            status.setGameStatus(userInput.inputUserNum());
        }
    }
}