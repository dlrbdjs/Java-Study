import java.util.Scanner;
import java.util.Random;

public class Baseball {
    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        int continueGame = 1;
        int[] randomNumList = getRandomList();

        System.out.println("숫자 야구 게임을 시작합니다.");

        while(continueGame == 1) {

            int[] randomNumList = getRandomList();
            int[] userInputList = getUserInputList();
            int[] strikeBallCnt = getStrikeBallCnt(randomNumList, userInputList);

            int strikeCnt = strikeBallCnt[0];
            int ballCnt = strikeBallCnt[1];

            if (strikeCnt == 0 && ballCnt == 0) {
                System.out.println("낫싱");
            }

            System.out.printf("%d 스트라이크, %d 볼", strikeCnt, ballCnt);

            if (strikeCnt == 3) {
                Scanner sc = new Scanner(System.in);

                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

                continueGame = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("게임종료");
    }


    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

    public static int[] getRandomList() {
        int[] randomNumList = new int[3];
        int passCnt = 0;
        int randomNum = getRandomNumber();

        for (int i = 0; i < 3; i++) {
            while(passCnt < i){
                if (randomNumList[passCnt] == randomNum){
                    randomNum = getRandomNumber();
                    passCnt = 0;
                }
                else{
                    passCnt++;
                }
            }
            passCnt = 0;
            randomNumList[i] = randomNum;
        }
        for (int i = 0; i < 3; i++){
            System.out.printf("%d", randomNumList[i]);
        }

        return randomNumList;
    }

    public static int[] getUserInputList() {
        int[] userInputList = new int[3];
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요: ");

        String userInput = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            userInputList[i] = Character.getNumericValue(userInput.charAt(i));
        }

        return userInputList;
    }

    public static int[] getStrikeBallCnt(int[] randomList, int[] userList) {
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