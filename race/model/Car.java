package race.model;

import race.view.Message;

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

    public void printDash(){ // car 객체에 옮기기
        for (int i = 0; i < this.distance; i++) {
            Message.RACE_RESULT_DASH.print();
        }
        System.out.println();
    }
}
