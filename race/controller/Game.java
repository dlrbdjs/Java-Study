package race.controller;

import race.model.Info;
import race.view.UserInput;

public class Game {

    UserInput userInput = new UserInput();
    Result result = new Result();
    Info info = new Info();
    ValidationHandler validation = new ValidationHandler();

    public void playGame(){
        info.setCarInfo(validation.validateName(userInput.inputName()));
        result.raceResult(info.carInfo, userInput.inputAttempts());
    }
}
