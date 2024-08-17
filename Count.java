public class Count {
    public int[] getStrikeBallCnt(int[] randomList, int[] userList) {
        int[] strikeBallCnt = new int[Game.strikeBallListLength];

        for (int i = 0; i < Game.maxNumListLength; i++) {
            for (int j = 0; j < Game.maxNumListLength; j++) {
                if(randomList[i] == userList[j]){
                    if (i == j){
                        strikeBallCnt[0]++;
                    }
                    else {
                        strikeBallCnt[1]++;
                    }
                    break;
                }
            }
        }
        return strikeBallCnt;
    }
}