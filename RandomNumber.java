import java.util.Random;

public class RandomNumber {

    int[] randomNumList = new int[ConstVariable.maxNumListLength];

    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(ConstVariable.randomNumBound) + 1;
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

    public void getRandomNumberList() {
        Print print = new Print();
        randomNumList = getDifferentNumberList(randomNumList);
        print.printAnswer(randomNumList);
    }
}