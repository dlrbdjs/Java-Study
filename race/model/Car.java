package race.model;

import race.common.util.Condition;
import race.view.Message;

import java.util.stream.IntStream;

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

    public void printDash(){//모델에서 뷰를 알면 안된다 리턴값해서 컨트롤러한테 리턴할 것
        IntStream.range(0, this.distance)
                .forEach(dist -> Message.RACE_RESULT_DASH.print());
        System.out.println();
    }
}
