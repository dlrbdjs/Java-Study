package race.model;

import race.common.util.Condition;
import race.view.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static race.common.util.ConstVariable.COMMA;
import static race.common.util.ConstVariable.MAX_NAME_LENGTH;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars){
        validateName(cars);
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public int getMaxDistance(){
        return cars.stream()
                .map(Car::getDistance)
                .max(Integer::compare)
                .orElseThrow();
    }

    public String getWinnerName(){
        Condition condition = new Condition();
        return cars.stream()
                .filter(car -> condition.isSameNum(car.getDistance(), getMaxDistance()))
                .map(Car::getName)
                .collect(Collectors.joining(COMMA));
    }

    public void validateName(List<Car> cars){ // 이것도 사실 모델이 뷰를 알아버린거 같은데요?
        cars.stream()
                .filter(name -> name.getName().length() > MAX_NAME_LENGTH)
                .findAny()
                .ifPresent( name -> {
                    throw new IllegalArgumentException(Message.INPUT_ERROR.toString());
                });
    }
}
