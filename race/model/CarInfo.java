package race.model;

import race.view.Message;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static race.common.util.ConstVariable.INIT_DISTANCE;
import static race.common.util.ConstVariable.MAX_NAME_LENGTH;

public class CarInfo {

    public CarInfo(List<Car> carInfo){
        validateName(carInfo);
        this.carInfo = carInfo;
    }

    private List<Car> carInfo;

//    public void setCarInfo(String[] carNames) {
//        carInfo = new ArrayList<>();
//        for (String carName : carNames){
//            carInfo.add(new Car(carName, INIT_DISTANCE));
//        }
//    }

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
