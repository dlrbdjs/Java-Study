public class Game {

    RandomNumber randomNumber = new RandomNumber();
    UserNumber userNumber = new UserNumber();
    Count count = new Count(this.randomNumber, this.userNumber);
    Result result = new Result(this.count);

    public void playGame() {

        randomNumber.getRandomNumberList();
        System.out.print("숫자 야구 게임을 시작합니다.");

        while(!(result.gameStatus.equals("stop"))) {
            if((result.gameStatus.equals("continue"))){
                randomNumber.getRandomNumberList();
                result.initGameStatus();
            }
            userNumber.getUserNumList();
            count.getStrikeBallCnt();
            result.gameResult();
        }
        System.out.println("게임종료");
    }
}