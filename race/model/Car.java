package race.model;

import race.view.Message;

import java.util.stream.IntStream;

public class Car {
    Car(String name, int distance){
        this.name = name;
        this.distance = distance;
    }

    private String name;
    private int distance;

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void addDistance(){
       this.distance++;
    }

    public void printDash(){
        IntStream.range(0, this.distance)
                .forEach(dist -> Message.RACE_RESULT_DASH.print());
        System.out.println();
    }
}
