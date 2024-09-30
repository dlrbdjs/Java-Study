package race.controller;

import race.common.util.Condition;
import race.model.Car;
import race.view.Message;

import java.util.List;
import java.util.stream.Collectors;

import static race.common.util.ConstVariable.COMMA;

public class Result {
    Condition condition = new Condition();

    public void raceResult(List<Car> cars, int attempts){
        System.out.println();
        Message.GAME_RESULT.println();

        for (int i = 0; i < attempts; i++) {
            cars.stream()
                    .filter(car -> condition.isPossibleToMove())
                    .forEach(Car::addDistance);
            cars.forEach(this::printResult);
            System.out.println();
        }
        raceWinner(cars);
    }

    public void printResult(Car car){
        Message.RACE_RESULT_COLON.print(car.getName(), true);
        car.printDash();
    }

    public void raceWinner(List<Car> cars){
        String winner = cars.stream()
                .filter(car -> condition.isMaxDistance(car, cars))
                .map(Car::getName)
                .collect(Collectors.joining(COMMA));
        Message.RACE_WINNER.print(winner, false);
    }

    public int getMaxDistance(List<Car> cars){
        return cars.stream()
                .map(Car::getDistance)
                .max(Integer::compare)
                .orElseThrow();
    }
}
