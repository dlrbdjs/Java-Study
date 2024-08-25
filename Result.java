public class Result {

    private final Count count;
    Result(Count count){
        this.count = count;
    }

    int continueGame = 0;
    String gameStatus = "";

    public void gameResult() {
        UserInput userInput = new UserInput();

        if (count.strikeCnt == 0 && count.ballCnt == 0) {
            System.out.println("낫싱");
        }

        if(count.ballCnt != 0){
            System.out.printf("%d볼 ", count.ballCnt);
        }

        if(count.strikeCnt != 0){
            System.out.printf("%d스트라이크", count.strikeCnt);
        }

        if (count.strikeCnt == 3) {
            System.out.println();
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

            continueGame = userInput.inputUserNum();

            if(continueGame == 1){
                gameStatus = "continue";
            }
            if(continueGame == 2){
                gameStatus = "stop";
            }
        }
    }

    public void initGameStatus(){
        gameStatus = "";
    }
}