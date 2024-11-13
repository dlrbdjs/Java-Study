package baseball.controller;

import baseball.model.Count;
import baseball.model.Numbers;
import baseball.view.Message;

public class Game {

    Numbers numbers = new Numbers();
    Count count = new Count();
    Result result = new Result();
    UserInput userInput = new UserInput();

    public void playGame() {

        Message.START_GAME.print();
        numbers.initRandomNumbers();
        while(!(result.status.gameStatus.equals("stop"))) {
            if((result.status.gameStatus.equals("continue"))){
                numbers.initRandomNumbers();
                result.status.initGameStatus();
            }
            numbers.initUserNums(userInput.inputUserNumbers());
            System.out.println(numbers.getRandomNumbers());
            System.out.println(numbers.getUserNumbers());
            count.getStrikeBallCnt(numbers.getRandomNumbers(), numbers.getUserNumbers());
            result.gameResult(count.strikeCnt, count.ballCnt);
        }
    }
}