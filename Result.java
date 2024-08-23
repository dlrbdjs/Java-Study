import java.util.Scanner;

public class Result {
    int continueGame = 0;
    String gameStatus = "";

    public void gameResult(int strikeCnt, int ballCnt) {
        Game game = new Game();
        Scanner sc = new Scanner(System.in);

        if (strikeCnt == 0 && ballCnt == 0) {
            gameStatus =  "gameResultNothing";
            System.out.println("낫싱");
        }

        if(ballCnt != 0){
            System.out.printf("%d볼 ", ballCnt);
        }

        if(strikeCnt != 0){
            System.out.printf("%d스트라이크", strikeCnt);
        }

        if (strikeCnt == 3) {
            System.out.println();
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

            continueGame = sc.nextInt();

            if(continueGame == 1){
                gameStatus = "gameStatusContinue";
                game.randomNumList = game.randomNumber.getRandomNumberList(); //여기도
            }
            if(continueGame == 2){
                gameStatus = "gameStatusStop";
            }
        }
    }
}
