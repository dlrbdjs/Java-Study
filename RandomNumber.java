import java.util.Random;

public class RandomNumber {
    private final Numbers numbers;

    RandomNumber(Numbers numbers) {
        this.numbers = numbers;
    }

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

    public void getRandomNums() {
        Print print = new Print();
        numbers.randomNums = getDifferentNumberList(numbers.randomNums);
        print.printAnswer(numbers.randomNums);
    }
}