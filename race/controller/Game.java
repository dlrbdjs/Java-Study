package race.controller;

import race.model.Info;

public class Game {

    UserInput userInput = new UserInput();
    Result result = new Result();
    Info info = new Info();

    public void playGame(){
        info.setCarInfo(userInput.inputName());
        result.raceResult(info.carInfo, userInput.inputAttempts());
    }
}