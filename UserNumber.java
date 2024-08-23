import java.util.Scanner;

public class UserNumber {

    int[] userNumList = new int[ConstVariable.maxNumListLength];

    public void getUserNumList() {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("숫자를 입력해주세요: ");
        String userInput = sc.nextLine();

        for (int i = 0; i < ConstVariable.maxNumListLength; i++) {
            userNumList[i] = Character.getNumericValue(userInput.charAt(i));
        }
    }
}
