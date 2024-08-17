import java.util.Scanner;

public class UserNumber {
    public int[] getUserNumList() {

        int[] userNumList = new int[3];
        System.out.print("숫자를 입력해주세요: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            userNumList[i] = Character.getNumericValue(userInput.charAt(i));
        }

        return userNumList;
    }
}
