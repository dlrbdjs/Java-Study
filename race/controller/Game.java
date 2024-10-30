package race.controller;

import race.common.util.customexception.FrontSpaceException;
import race.common.util.customexception.SameNameException;
import race.model.Cars;
import race.view.ErrorMessage;
import race.view.UserInput;

public class Game {

    UserInput userInput = new UserInput();
    Result result = new Result();

    public void playGame() {
        try {
            Cars cars = new Cars(userInput.inputName());
            result.race(cars, userInput.inputAttempts());
        } catch (IllegalArgumentException e) {
            ErrorMessage.INPUT_ERROR_LENGTH.println();
        } catch (FrontSpaceException e) {
            ErrorMessage.INPUT_ERROR_SPACE.println();
        } catch (SameNameException e) {
            ErrorMessage.INPUT_ERROR_SAME.println();
        }
    }
}
