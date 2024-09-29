package race.controller;

import race.model.Car;
import race.model.CarInfo;
import race.view.UserInput;

import java.util.ArrayList;
import java.util.List;

import static race.common.util.ConstVariable.INIT_DISTANCE;

public class Game {

    UserInput userInput = new UserInput();
    Result result = new Result();
    CarInfo carInfo = new CarInfo(setCarInfo(userInput.inputName()));

    public void playGame(){
        result.raceResult(carInfo.getCarInfo(), userInput.inputAttempts());
    }

    //CarInfo 생성을 위한..
    public List<Car> setCarInfo(String[] carNames) {
        List<Car> carInfo = new ArrayList<>();
        for (String carName : carNames){
            carInfo.add(new Car(carName, INIT_DISTANCE));
        }
        return carInfo;
    }

}
