import java.util.Random;

public class RandomNumber {

    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

    public int[] getDifferentNumberList(int[] NumList) {
        int passCnt = 0;
        int randomNum = getRandomNumber();
        for (int i = 0; i < 3; i++) {
            while(passCnt < i){
                if (NumList[passCnt] == randomNum){
                    randomNum = getRandomNumber();
                    passCnt = 0;
                }
                else{
                    passCnt++;
                }
            }
            passCnt = 0;
            NumList[i] = randomNum;
        }
        return NumList;
    }

    public int[] getRandomNumberList() {
        int[] randomNumList = new int[3];
        randomNumList = getDifferentNumberList(randomNumList);
        return randomNumList;
    }
}