package race.controller;

import race.model.Car;
import race.model.Cars;
import race.view.UserInput;

import java.util.ArrayList;
import java.util.List;

public class Game {

    UserInput userInput = new UserInput();
    Result result = new Result();
    Cars cars = new Cars(setCars(userInput.inputName()));

    public void playGame(){
        result.raceResult(cars, userInput.inputAttempts());
    }

    //CarInfo 생성을 위한..
    public List<Car> setCars(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames){
            cars.add(new Car(carName));
        }
        return cars;
    }

}
