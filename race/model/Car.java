package race.model;

import race.common.util.Condition;
import race.common.util.ConstVariable;

public class Car {

    private final String name;
    private int distance;
    private boolean moveCondition;

    public Car(String name) {
        this.name = name;
        this.distance = ConstVariable.INIT_DISTANCE;
        this.moveCondition = false;
    }

    public String getName() {
        return name;
    }

    public String getDistance() {
        return ConstVariable.DISTANCE_HYPHEN.repeat(distance);
    }

    public void carMove() {
        setMoveCondition();
        addDistance();
    }

    public void addDistance() {
        if (this.moveCondition) {
            this.distance++;
        }
    }

    public void setMoveCondition() {
        this.moveCondition = Condition.isBiggerThanFour();
    }
}
