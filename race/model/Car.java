package race.model;

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
}
