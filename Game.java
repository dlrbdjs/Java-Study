import java.util.Random;
import java.util.Scanner;

public class Game {

    public static RandomNumber randomNumber = new RandomNumber();
//    RandomNumber randomNumber = new RandomNumber();
    UserNumber userNumber = new UserNumber();
    Count count = new Count();
    PrintList printlist = new PrintList();
    Result result = new Result();
    public static Scanner sc = new Scanner(System.in);
//    Scanner sc = new Scanner(System.in);

    public static final int maxNumListLength = 3;
    public static final int strikeBallListLength = 2;

    public static int [] randomNumList;

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
