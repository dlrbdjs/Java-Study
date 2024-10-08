package race.controller;

import race.common.util.Condition;
import race.model.Car;
import race.view.Message;

import java.util.List;
import java.util.stream.Collectors;

import static race.common.util.ConstVariable.COMMA;

public class Result {
    Condition condition = new Condition();

    public void raceResult(List<Car> carInfo, int attempts){
        System.out.println();
        Message.GAME_RESULT.println();

        for (int i = 0; i < attempts; i++) {
            carInfo.stream()
                    .filter(car -> condition.isPossibleToMove())
                    .forEach(Car::addDistance);
            carInfo.forEach(this::printResult);
            System.out.println();
        }
        raceWinner(carInfo);
    }

    public void printResult(Car car){
        Message.RACE_RESULT_COLON.print(car.getName(), true);
        car.printDash();
    }

    public void raceWinner(List<Car> carInfo){
        String winner = carInfo.stream()
                .filter(car -> condition.isMaxDistance(car, carInfo))
                .map(Car::getName)
                .collect(Collectors.joining(COMMA));
        Message.RACE_WINNER.print(winner, false);
    }

    public int getMaxDistance(List<Car> carInfo){
        return carInfo.stream()
                .map(Car::getDistance)
                .max(Integer::compare)
                .orElseThrow();
    }
}
