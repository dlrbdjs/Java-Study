package baseball.controller;

import baseball.model.Count;
import baseball.model.Numbers;
import baseball.view.Message;
import baseball.view.ErrorMessage;
import baseball.view.UserInput;

public class Game {

    Numbers numbers = new Numbers();
    Count count = new Count();
    Result result = new Result();
    UserInput userInput = new UserInput();

    public void playGame() {

        Message.START_GAME.print();

        try {
            while (result.status.getGameStatus()) {
                if (result.status.getGenerateNumberStatus()) {
                    numbers.setRandomNumbers();
                    result.status.initGenerateNumberStatus();
                }
                numbers.setUserNumbers(userInput.inputUserNumbers());
                count.setStrikeCount(numbers.getUserNumbers(), numbers.getRandomNumbers());
                count.setBallCount(numbers.getUserNumbers(), numbers.getRandomNumbers());
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