package baseball.model;

import baseball.common.util.ConstVariable;

import java.util.stream.IntStream;

public class Count {

    public int strikeCnt;
    public int ballCnt;

    public void getStrikeBallCnt(int[] rand, int[] user) {
        strikeCnt = 0;
        ballCnt = 0;
        IntStream.range(0, ConstVariable.maxNumListLength)
                .forEach(i -> IntStream.range(0, ConstVariable.maxNumListLength)
                        .filter(j -> rand[i] == user[j])
                        .findFirst()
                        .ifPresent(j -> {
                            if (i == j) {
                                strikeCnt++;
                            } else {
                                ballCnt++;
                            }
                        }));

//        for (int i = 0; i < ConstVariable.maxNumListLength; i++) {
//            for (int j = 0; j < ConstVariable.maxNumListLength; j++) {
//                if(rand[i] == user[j]){
//                    if (i == j){
//                        strikeCnt++;
//                    }
//                    else {
//                        ballCnt++;
//                    }
//                    break;
//                }
//            }
//        }
    }
}