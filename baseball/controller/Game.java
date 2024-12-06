package baseball.controller;

import baseball.model.Numbers;
import baseball.model.UserNumbers;
import baseball.view.Message;
import baseball.view.UserInput;

public class Game {

    UserNumbers userNumbers = new UserNumbers();
    Numbers randomNumbers = new Numbers();
    Result result = new Result();
    UserInput userInput = new UserInput();

    public void playGame() {

        Message.START_GAME.print();
        while (result.status.getGameStatus()) {
            initGame();
            userNumbers.setNumbers(userInput.inputUserNumbers());
            result.baseBall(userNumbers, randomNumbers);
        }
    }

    public void initGame(){
        if (result.status.getGenerateNumberStatus()) {
            randomNumbers.setNumbers();
            result.status.initGenerateNumberStatus();
        }
    }
}