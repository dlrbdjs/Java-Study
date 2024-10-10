package race.common.util;

import race.model.Car;

import java.util.List;

import static race.common.util.ConstVariable.MAX_NAME_LENGTH;
import static race.common.util.ConstVariable.MOVE_CONDITION_VALUE_FOUR;

public class Condition {
    public boolean isBiggerThanFour(){
        Random random = new Random();
        return random.randNum() >= MOVE_CONDITION_VALUE_FOUR;
    }

    public boolean isSameNum(int carDist, int carsDist){
        return carDist == carsDist;
    }

    public boolean isMoreThanFiveLetters(String str){
        return str.length() > MAX_NAME_LENGTH;
    }

    public boolean isFrontSpace(String str){
        return str.charAt(0) == ' ';
    }

    public boolean isSameName(List<Car> cars){
        return cars.size() != cars.stream()
                .map(Car::getName)
                .distinct()
                .count();
    }
}
