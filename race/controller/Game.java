package race.controller;

import race.model.Cars;
import race.view.Message;
import race.view.UserInput;

public class Game {

    UserInput userInput = new UserInput();
    Result result = new Result();

    public void playGame(){
        try{
            Cars cars = new Cars(userInput.inputName());
            result.race(cars, userInput.inputAttempts());
        }catch (IllegalArgumentException e){
            Message.INPUT_ERROR.println();
        }

    }
}
