package race.model;

import race.common.util.Condition;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static race.common.util.ConstVariable.COMMA;

public class Cars {

    Condition condition = new Condition();

    private final List<Car> cars;

    public Cars(String[] carNames){
        this.cars = new ArrayList<>();
        for (String carName : carNames){
            this.cars.add(new Car(carName));
        }
        validateName(cars);
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

    public String getWinnerName(){ // 굳이 모델에 부하를 준건지?
        return cars.stream()
                .filter(car -> condition.isSameNum(car.getDistance(), getMaxDistance()))
                .map(Car::getName)
                .collect(Collectors.joining(COMMA));
    }

    public void validateName(List<Car> cars){
        cars.stream()
                .filter(car -> condition.isMoreThanFiveLetters(car.getName()))
                .findAny()
                .ifPresent( name -> {
                    throw new IllegalArgumentException();
                });
    }
}
