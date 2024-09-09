package baseball.controller;

import baseball.view.Message;
import baseball.model.Status;

public class Result {

    Status status = new Status();

    public void gameResult(int strike, int ball) {
        if (strike == 0 && ball == 0) {
            Message.NOTHING.print();
        }

        if(ball != 0){
            Message.BALL.print(ball);
        }

        if(strike != 0){
            Message.STRIKE.print(strike);
        }

        if (strike == 3) {
            UserInput userInput = new UserInput();

            System.out.println();
            Message.END_GAME.println();
            Message.RESTART_GAME.println();

            status.changeStatus(userInput.inputUserNum());
        }
    }
}