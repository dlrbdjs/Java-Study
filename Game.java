public class Game {

    Numbers numbers = new Numbers();
    UserInput userInput = new UserInput(this.numbers);
    RandomNumber randomNumber = new RandomNumber(this.numbers);
    Count count = new Count(this.numbers);
    Result result = new Result(this.count);

    public void playGame() {
        randomNumber.getRandomNums();
        System.out.print("숫자 야구 게임을 시작합니다.");

        while(!(result.gameStatus.equals("stop"))) {
            if((result.gameStatus.equals("continue"))){
                randomNumber.getRandomNums();
                result.initGameStatus();
            }
            userInput.inputUserNums();
            count.getStrikeBallCnt();
            result.gameResult();
        }
        System.out.println("게임종료");
    }
}