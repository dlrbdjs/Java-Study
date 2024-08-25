public class Count {

    private final Numbers numbers;
    Count(Numbers numbers) {
        this.numbers = numbers;
    }

    int strikeCnt;
    int ballCnt;

    public void getStrikeBallCnt() {
        strikeCnt = 0;
        ballCnt = 0;
        for (int i = 0; i < ConstVariable.maxNumListLength; i++) {
            for (int j = 0; j < ConstVariable.maxNumListLength; j++) {
                if(numbers.randomNums[i] == numbers.userNums[j]){
                    if (i == j){
                        strikeCnt++;
                    }
                    else {
                        ballCnt++;
                    }
                    break;
                }
            }
        }
    }
}