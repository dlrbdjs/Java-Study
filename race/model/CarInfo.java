package race.model;

import java.util.ArrayList;
import java.util.List;

import static race.common.util.ConstVariable.INIT_DISTANCE;

public class CarInfo {

    public List<Car> carInfo = new ArrayList<>();

    public void setCarInfo(String[] carNames) {
        for (String carName : carNames){
            carInfo.add(new Car(carName, INIT_DISTANCE));
        }
    }
}
