package baseball.model;

import baseball.common.util.ConstVariable;

public class Count {

    public int strikeCnt;
    public int ballCnt;

    public void getStrikeBallCnt(int[] rand, int[] user) {
        strikeCnt = 0;
        ballCnt = 0;
        for (int i = 0; i < ConstVariable.maxNumListLength; i++) {
            for (int j = 0; j < ConstVariable.maxNumListLength; j++) {
                if(rand[i] == user[j]){
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