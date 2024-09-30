package race.model;

import race.view.Message;

import java.util.List;

import static race.common.util.ConstVariable.MAX_NAME_LENGTH;

public class Cars {

    private final List<Car> carInfo;

    public Cars(List<Car> carInfo){
        validateName(carInfo);
        this.carInfo = carInfo;
    }

    public List<Car> getCarInfo() {
        return carInfo;
    }

    public void validateName(List<Car> carInfo){
        carInfo.stream()
                .filter(name -> name.getName().length() > MAX_NAME_LENGTH)
                .findAny()
                .ifPresent( name -> {
                    throw new IllegalArgumentException(Message.INPUT_ERROR.toString());
                });
    }
}
