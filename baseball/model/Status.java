package baseball.model;

public class Status {
    public String gameStatus = "";

    public void changeStatus(int input){
        if(input == 1) {
            gameStatus = "continue";
        } else if (input == 2) {
            gameStatus = "stop";
        }
    }

    public void initGameStatus(){
        gameStatus = "";
    }
}
