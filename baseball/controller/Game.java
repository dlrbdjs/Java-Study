package baseball.controller;

import baseball.model.Count;
import baseball.model.Numbers;
import baseball.view.Message;

public class Game {

    Numbers numbers = new Numbers();
    Count count = new Count();
    Result result = new Result();

    public void playGame() {
        numbers.getRandNums();
        Message.START_GAME.print();

        while(!(result.status.gameStatus.equals("stop"))) {
            if((result.status.gameStatus.equals("continue"))){
                numbers.getRandNums();
                result.status.initGameStatus();
            }
            numbers.getUserNums();
            count.getStrikeBallCnt(numbers.randomNums, numbers.userNums);
            result.gameResult(count.strikeCnt, count.ballCnt);
        }
    }
}