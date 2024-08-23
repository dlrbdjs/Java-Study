public class Game {

    RandomNumber randomNumber = new RandomNumber();
    UserNumber userNumber = new UserNumber();
    Count count = new Count();
    Print print = new Print();
    Result result = new Result();

    int [] randomNumList;

    public void playGame() {

        randomNumList = randomNumber.getRandomNumberList();
        print.printAnswer(randomNumList);

        System.out.print("숫자 야구 게임을 시작합니다.");

        while(!(result.gameStatus.equals("gameStatusStop"))) {

            int[] userNumList = userNumber.getUserNumList();
            count.getStrikeBallCnt(randomNumList, userNumList);


            result.gameResult(count.strikeCnt, count.ballCnt);

        }
        System.out.println("게임종료");
    }
}
