package race.controller;

import race.model.CarInfo;
import race.view.UserInput;

public class Game {

    UserInput userInput = new UserInput();
    Result result = new Result();
    CarInfo info = new CarInfo();
    ValidationHandler validation = new ValidationHandler();

    public void playGame(){
        info.setCarInfo(validation.validateName(userInput.inputName()));
        result.raceResult(info.getCarInfo(), userInput.inputAttempts());
    }
}
