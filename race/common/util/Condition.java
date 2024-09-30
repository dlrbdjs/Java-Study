package race.common.util;

import race.model.Car;
import race.controller.Result;

import java.util.List;

import static race.common.util.ConstVariable.MOVE_CONDITION_VALUE;

public class Condition {
    public boolean isPossibleToMove(){
        Random random = new Random();
        return random.randNum() >= MOVE_CONDITION_VALUE;
    }

    public boolean isMaxDistance(Car car, List<Car> cars){
        Result result = new Result();
        return car.getDistance() == result.getMaxDistance(cars);
    }
}
