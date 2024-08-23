public class Count {

    int strikeCnt;
    int ballCnt;

    public void getStrikeBallCnt(int[] randomList, int[] userList) {
        strikeCnt = 0;
        ballCnt = 0;
        for (int i = 0; i < ConstVariable.maxNumListLength; i++) {
            for (int j = 0; j < ConstVariable.maxNumListLength; j++) {
                if(randomList[i] == userList[j]){
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