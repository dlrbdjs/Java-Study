import java.util.Scanner;

public class UserNumber {
    public int[] getUserNumList() {
        Scanner sc = new Scanner(System.in);

        int[] userNumList = new int[3];
        System.out.println();
        System.out.print("숫자를 입력해주세요: ");
        String userInput = sc.nextLine();

        for (int i = 0; i < ConstVariable.maxNumListLength; i++) {
            userNumList[i] = Character.getNumericValue(userInput.charAt(i));
        }

        return userNumList;
    }
}
