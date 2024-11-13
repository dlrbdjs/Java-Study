package baseball.model;

import baseball.common.util.ConstVariable;

import java.util.List;
import java.util.stream.IntStream;

public class Count {

    public int strikeCnt;
    public int ballCnt;

    public void getStrikeBallCnt(List<Integer> rand, List<Integer> user) {
        strikeCnt = 0;
        ballCnt = 0;
        IntStream.range(0, ConstVariable.MAX_NUM_LIST_LENGTH)
                .forEach(i -> IntStream.range(0, ConstVariable.MAX_NUM_LIST_LENGTH)
                        .filter(j -> rand.get(i).equals(user.get(j)))
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