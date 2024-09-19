package race.model;

public class Car {
    Car(String name, int distance){
        this.name = name;
        this.distance = distance;
    }

    String name;
    int distance;

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void addDistance(){
       this.distance++;
    }

//    @Override
//    public String toString(){
//        return "{name='" + name + "', distance=" + distance + "}";
//
//    }
}
