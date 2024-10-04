package race.model;

import race.common.util.Condition;

import static race.common.util.ConstVariable.INIT_DISTANCE;

public class Car {

    private final String name;
    private int distance;
    private boolean moveCondition;

    public Car(String name){
        this.name = name;
        this.distance = INIT_DISTANCE;
        this.moveCondition = false;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void carMove(){
        setMoveCondition();
        addDistance();
    }

    public void addDistance(){
       if (this.moveCondition){
           this.distance++;
       }
    }

    public void setMoveCondition(){
        Condition condition = new Condition();
        this.moveCondition = condition.isBiggerThanFour();
    }
}
