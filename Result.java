import java.util.Scanner;

public class Result {
    int continueGame = 0;

    public String gameResult(int strikeCnt, int ballCnt) {
//        Game game = new Game();

        if (strikeCnt == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

            continueGame = Game.sc.nextInt();
//            continueGame = game.sc.nextInt();

            if(continueGame == 1){
                Game.randomNumList = Game.randomNumber.getRandomNumberList();
//                game.randomNumList = game.randomNumber.getRandomNumberList();
                return "gameStatusContinue";
            }
            return "gameStatusStop";
        }
        if (strikeCnt == 0 && ballCnt == 0) {
            System.out.println("낫싱");
            return "gameResultNothing";
        }

        System.out.printf("%d 스트라이크, %d 볼", strikeCnt, ballCnt);
        System.out.println();
        return "gameResult";

    }
}
