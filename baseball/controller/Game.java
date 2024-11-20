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
                if (result.status.getGenerateNumberStatus()) {
                    randomNumbers.setRandomNumbers();
                    result.status.initGenerateNumberStatus();
                }
                userNumbers.setUserNumbers(userInput.inputUserNumbers());
                count.setStrikeCount(userNumbers, randomNumbers);
                count.setBallCount(userNumbers, randomNumbers);
                result.gameResult(count.getStrikeCount(), count.getBallCount());

                count.initCount();
            }
        } catch (IndexOutOfBoundsException e) {
            ErrorMessage.INPUT_ERROR_LENGTH.print();
        } catch (NumberFormatException e) {
            ErrorMessage.INPUT_ERROR_TYPE.print();
        } catch (IllegalArgumentException e) {
            ErrorMessage.INPUT_ERROR_SAME.print();
        }

    }
}