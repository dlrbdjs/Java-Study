package race.controller;

import race.common.util.Condition;
import race.model.Car;
import race.model.Cars;
import race.view.Message;

import java.util.stream.Collectors;

import static race.common.util.ConstVariable.COMMA;

public class Result {
    Condition condition = new Condition();

    public void raceResult(Cars cars, int attempts){
        System.out.println();
        Message.GAME_RESULT.println();

        for (int i = 0; i < attempts; i++) {
            cars.getCars().stream()
                    .filter(car -> condition.isPossibleToMove())
                    .forEach(Car::addDistance);
            cars.getCars().forEach(this::printResult);
            System.out.println();
        }
        raceWinner(cars);
    }

    public void printResult(Car car){
        Message.RACE_RESULT_COLON.print(car.getName(), true);
        car.printDash();
    }

    public void raceWinner(Cars cars){
        String winner = cars.getCars().stream()
                .filter(car -> condition.isMaxDistance(car, cars))
                .map(Car::getName)
                .collect(Collectors.joining(COMMA));
        Message.RACE_WINNER.print(winner, false);
    }

    public int getMaxDistance(Cars cars){
        return cars.getCars().stream()
                .map(Car::getDistance)
                .max(Integer::compare)
                .orElseThrow();
    }
}
