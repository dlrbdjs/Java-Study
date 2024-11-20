package baseball.controller;

import baseball.common.util.Condition;
import baseball.view.Message;
import baseball.model.Status;
import baseball.view.UserInput;

public class Result {

    Status status = new Status();

    public void gameResult(int strikeCount, int ballCount) {
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