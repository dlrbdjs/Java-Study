package race.controller;

import race.model.Car;
import race.model.Cars;
import race.view.Message;

public class Result {

    public void raceResult(Cars cars, int attempts){
        System.out.println();
        Message.GAME_RESULT.println();

        for (int i = 0; i < attempts; i++) {
            cars.getCars().forEach(Car::carMove);
            cars.getCars().forEach(this::printResult);
            System.out.println();
        }
        raceWinner(cars);
    }

    public void printResult(Car car){
        Message.RACE_RESULT_COLON.print(car.getName(), true);
        for (int i = 0; i < car.getDistance(); i++) {
            Message.RACE_RESULT_DASH.print();
        }
        System.out.println();
    }

    public void raceWinner(Cars cars){
        Message.RACE_WINNER.print(cars.getWinnerName(), false);
    }
}
