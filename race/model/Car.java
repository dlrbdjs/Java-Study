package race.model;

import race.view.Message;

import java.util.stream.IntStream;

import static race.common.util.ConstVariable.INIT_DISTANCE;

public class Car {

    private final String name;
    private int distance;

    public Car(String name){
        this.name = name;
        this.distance = INIT_DISTANCE;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void addDistance(){
       this.distance++;
    }

    public void printDash(){//모델에서 뷰를 알면 안된다 리턴값해서 컨트롤러한테 리턴할 것
        IntStream.range(0, this.distance)
                .forEach(dist -> Message.RACE_RESULT_DASH.print());
        System.out.println();
    }
}
