package baseball.controller;

import baseball.model.Count;
import baseball.model.Numbers;
import baseball.view.Message;
import baseball.view.ErrorMessage;
import baseball.view.UserInput;

public class Game {

    Numbers userNumbers = new Numbers();
    Numbers randomNumbers = new Numbers();
    Count count = new Count();
    Result result = new Result();
    UserInput userInput = new UserInput();

    public void playGame() {

        Message.START_GAME.print();

        try {
            while (result.status.getGameStatus()) {
                initGame();
                userNumbers.setNumbers(userInput.inputUserNumbers());
                result.baseBall(userNumbers, randomNumbers);
            }
        } catch (IndexOutOfBoundsException e) {
            ErrorMessage.INPUT_ERROR_LENGTH.print();
        } catch (NumberFormatException e) {
            ErrorMessage.INPUT_ERROR_TYPE.print();
        } catch (IllegalArgumentException e) {
            ErrorMessage.INPUT_ERROR_SAME.print();
        }
    }

    public void initGame(){
        if (result.status.getGenerateNumberStatus()) {
            randomNumbers.setNumbers();
            result.status.initGenerateNumberStatus();
        }
    }
}