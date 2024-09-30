package race.model;

import race.view.Message;

import java.util.List;

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

    public void validateName(List<Car> cars){
        cars.stream()
                .filter(name -> name.getName().length() > MAX_NAME_LENGTH)
                .findAny()
                .ifPresent( name -> {
                    throw new IllegalArgumentException(Message.INPUT_ERROR.toString());
                });
    }
}
