package race.model;

import java.util.ArrayList;
import java.util.List;

import static race.common.util.ConstVariable.INIT_DISTANCE;

public class CarInfo {

    private List<Car> carInfo;

    public void setCarInfo(String[] carNames) {
        carInfo = new ArrayList<>();
        for (String carName : carNames){
            carInfo.add(new Car(carName, INIT_DISTANCE));
        }
    }

    public List<Car> getCarInfo() {
        return carInfo;
    }
}
