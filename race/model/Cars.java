package race.model;

import race.common.util.Condition;
import race.common.util.customexception.FrontSpaceException;
import race.common.util.customexception.SameNameException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static race.common.util.ConstVariable.COMMA;

public class Cars {

    private final List<Car> cars;

    public Cars(String[] carNames) throws FrontSpaceException, SameNameException {
        this.cars = new ArrayList<>();
        for (String carName : carNames) {
            this.cars.add(new Car(carName));
        }
        validateName();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void allCarMove() {
        for (Car car : cars) {
            car.carMove();
        }
    }

    public int getMaxDistance() {
        return cars.stream()
                .map(Car::getDistance)
                .max(Integer::compare)
                .orElseThrow();
    }

    public String getWinnerName() {
        return cars.stream()
                .filter(car -> Condition.isSameNumber(car.getDistance(), getMaxDistance()))
                .map(Car::getName)
                .collect(Collectors.joining(COMMA));
    }

    public void validateName() throws FrontSpaceException, SameNameException {
        if (cars.stream()
                .anyMatch(car -> Condition.isMoreThanFiveLetters(car.getName()))) {
            throw new IllegalArgumentException();
        }
        if (cars.stream()
                .anyMatch(car -> Condition.isFrontSpace(car.getName()))) {
            throw new FrontSpaceException();
        }
        if (isSameName(cars)) {
            throw new SameNameException();
        }
    }

    private boolean isSameName(List<Car> cars) {
        return Condition.isSameString(cars.stream().map(Car::getName).toList());
    }
}
