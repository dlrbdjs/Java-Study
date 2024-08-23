public class Count {

    private final RandomNumber randomNumber;
    private final UserNumber userNumber;
    Count(RandomNumber randomNumber, UserNumber userNumber) {
        this.randomNumber = randomNumber;
        this.userNumber = userNumber;
    }

    int strikeCnt;
    int ballCnt;

    public void getStrikeBallCnt() {
        strikeCnt = 0;
        ballCnt = 0;
        for (int i = 0; i < ConstVariable.maxNumListLength; i++) {
            for (int j = 0; j < ConstVariable.maxNumListLength; j++) {
                if(randomNumber.randomNumList[i] == userNumber.userNumList[j]){
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