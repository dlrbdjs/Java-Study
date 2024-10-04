package race.common.util;

import race.model.Car;
import race.controller.Result;
import race.model.Cars;

import static race.common.util.ConstVariable.MOVE_CONDITION_VALUE_FOUR;

public class Condition {
    public boolean isBiggerThanFour(){
        Random random = new Random();
        return random.randNum() >= MOVE_CONDITION_VALUE_FOUR;
    }

    public boolean isMaxDistance(Car car, Cars cars){
        Result result = new Result();
        return car.getDistance() == result.getMaxDistance(cars);
    }
}
