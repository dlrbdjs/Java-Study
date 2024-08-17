public class Game {

    RandomNumber randomNumber = new RandomNumber();
    UserNumber userNumber = new UserNumber();
    Count count = new Count();
    PrintList printlist = new PrintList();
    Result result = new Result();

    int [] randomNumList;
    public void playGame() {

        randomNumList = randomNumber.getRandomNumberList();
        printlist.answerPrint(randomNumList);
        String gameStatus = "gameStatusContinue";

        System.out.println("숫자 야구 게임을 시작합니다.");

        while(!(gameStatus.equals("gameStatusStop"))) {

            int[] userNumList = userNumber.getUserNumList();
            int[] strikeBallCntList = count.getStrikeBallCnt(randomNumList, userNumList);

            int strikeCnt = strikeBallCntList[0];
            int ballCnt = strikeBallCntList[1];

            gameStatus = result.gameResult(strikeCnt, ballCnt);

        }
        System.out.println("게임종료");
    }
}
