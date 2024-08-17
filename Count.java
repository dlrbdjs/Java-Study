public class Count {
    public int[] getStrikeBallCnt(int[] randomList, int[] userList) {
        int[] strikeBallCnt = new int[2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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