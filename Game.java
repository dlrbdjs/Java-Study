public class Game {

    RandomNumber randomNumber = new RandomNumber();
    UserNumber userNumber = new UserNumber();
    Count count = new Count();
    Result result = new Result();

    public void playGame() {

        randomNumber.getRandomNumberList();
        System.out.print("숫자 야구 게임을 시작합니다.");

        while(!(result.gameStatus.equals("gameStatusStop"))) {
            if((result.gameStatus.equals("gameStatusContinue"))){
                randomNumber.getRandomNumberList();
                result.initGameStatus();
            }
            userNumber.getUserNumList();
            count.getStrikeBallCnt(randomNumber.randomNumList, userNumber.userNumList);
            result.gameResult(count.strikeCnt, count.ballCnt);
        }
        System.out.println("게임종료");
    }
}
