package race.controller;

import race.model.Car;
import race.model.Cars;
import race.view.Message;
import race.view.UserInput;

import java.util.ArrayList;
import java.util.List;

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

    //CarInfo 생성을 위한..
    public List<Car> makeCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames){
            cars.add(new Car(carName));
        }
        return cars;
    }

}
